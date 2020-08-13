package com.rono.springfirsttry.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = "com.rono.springfirsttry")
@PropertySource("classpath:persistence-mysql.properties")
public class AppConfiguration {

        //the variable is going to hold the data from the properties file
        @Autowired
        private Environment env;

        @Bean
        public ViewResolver viewResolver(){
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setPrefix("/WEB-INF/view/");
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }

        @Bean
        public DataSource dataSource(){

            //create connection pool
            ComboPooledDataSource dataSource = new ComboPooledDataSource();

            //set the jdbc driver class
            try {
                dataSource.setDriverClass(env.getProperty("jdbc.driver"));
            } catch (PropertyVetoException dataSourceExc) {
                throw new RuntimeException(dataSourceExc);
            }

            // set database connection properties
            dataSource.setJdbcUrl(env.getProperty("jdbc:url"));
            dataSource.setUser(env.getProperty("jdbc:user"));
            dataSource.setPassword(env.getProperty("jdbc:password"));

            // set connection pool properties
            dataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
            dataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
            dataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
            dataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));

            return dataSource;
        }

        /*
           when we read an environment property it comes as a string, so below
           there's a helper method to convert string to integer where it's needed
        */

        private int getIntProperty (String propertyName){
            String propertyValue = env.getProperty(propertyName);
            int intPropertyValue = Integer.parseInt(propertyValue);
            return intPropertyValue;
        }

        @Bean
        public LocalSessionFactoryBean getSessionFactory() {
            LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
            sessionFactory.setDataSource(getDataSource());
            sessionFactory.setPackagesToScan(new String[] { "com.bytestree.model" });
            sessionFactory.setHibernateProperties(getHibernateProperties());
            return sessionFactory;
         }

        @Bean
        public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
            HibernateTransactionManager txManager = new HibernateTransactionManager();
            txManager.setSessionFactory(sessionFactory);
            return txManager;
        }
}
