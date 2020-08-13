package com.rono.springfirsttry.entities;

import javax.persistence.*;

@Entity
@Table(name="users")
@SecondaryTables({
        @SecondaryTable(name="user_info"),
        @SecondaryTable(name="user_id")
})
public class Users {

    //below are the fields for the "users" table
    @Id
    @Column(name = "username",table = "users")
    private String username;
    @Column(name = "password", table = "users")
    private String password;
    @Column(name = "enabled", table = "users")
    private boolean enabled;

    //below are the fields for the "user_id" table
    @Id
    @Column(name = "id",table = "user_id")
    private int idIdTable;
    @Column(name = "username",table = "user_id")
    private String idTableUsername;

    //below are the fields for the "user_info" table
    @Id
    @Column(name = "id",table = "user_info")
    private int idInfoTable;
    @Column(name = "firstname",table = "user_info")
    private String firstName;
    @Column(name = "secondname",table = "user_info")
    private String secondName;
    @Column(name = "gender",table = "user_info")
    private String gender;
    @Column(name = "phone",table = "user_info")
    private int phoneNumber;

    // getters and setters
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public boolean getEnabled() {return enabled;}
    public void setEnabled(boolean enabled) {this.enabled = enabled;}

    public int getIdIdTable() {return idIdTable;}
    public void setIdIdTable(int idIdTable) {this.idIdTable = idIdTable;}

    public String getIdTableUsername() {return idTableUsername;}
    public void setIdTableUsername(String idTableUsername) {this.idTableUsername = idTableUsername;}

    public int getIdInfoTable() {return idInfoTable;}
    public void setIdInfoTable(int idInfoTable) {this.idInfoTable = idInfoTable;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getSecondName() {return secondName;}
    public void setSecondName(String secondName) {this.secondName = secondName;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
}
