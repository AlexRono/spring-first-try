package com.rono.springfirsttry.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="projects")
public class Projects {
    //table fields below
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "projectname")
    private String projectName;
    @Column(name = "creationdate")
    private Timestamp creationDate;
    @Column(name = "finisheddate")
    private Timestamp finishedDate;
    @Column(name = "description")
    private String description;
    @Column(name = "active")
    private boolean active;
    @Column(name = "totalhours")
    private int totalHours;
    @Column(name = "createdby")
    private int createdById;
    @Column(name = "closedby")
    private int closedById;

    //getters and setters

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getProjectName() {return projectName;}
    public void setProjectName(String projectName) {this.projectName = projectName;}

    public Timestamp getCreationDate() {return creationDate;}
    public void setCreationDate(Timestamp creationDate) {this.creationDate = creationDate;}

    public Timestamp getFinishedDate() {return finishedDate;}
    public void setFinishedDate(Timestamp finishedDate) {this.finishedDate = finishedDate;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public boolean isActive() {return active;}
    public void setActive(boolean active) {this.active = active;}

    public int getTotalHours() {return totalHours;}
    public void setTotalHours(int totalHours) {this.totalHours = totalHours;}

    public int getCreatedById() {return createdById;}
    public void setCreatedById(int createdById) {this.createdById = createdById;}

    public int getClosedById() {return closedById;}
    public void setClosedById(int closedById) {this.closedById = closedById;}
}
