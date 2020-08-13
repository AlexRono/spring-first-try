package com.rono.springfirsttry.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="tasks")
public class Tasks {

    //table fields below
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "taskname")
    private String taskName;
    @Column(name = "taskdescription")
    private String taskDescription;
    @Column(name = "creationdate")
    private Timestamp creationDate;
    @Column(name = "hoursspent")
    private int hoursSpent;
    @Column(name = "finishdate")
    private Timestamp finishDate;
    @Column(name = "status")
    private String status;
    @Column(name = "createdbyuser")
    private int createdByUserId;
    @Column(name = "assignedtouserid")
    private int assignedToUserId;

    //getters and setters

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTaskName() {return taskName;}
    public void setTaskName(String taskName) {this.taskName = taskName;}

    public String getTaskDescription() {return taskDescription;}
    public void setTaskDescription(String taskDescription) {this.taskDescription = taskDescription;}

    public Timestamp getCreationDate() {return creationDate;}
    public void setCreationDate(Timestamp creationDate) {this.creationDate = creationDate;}

    public int getHoursSpent() {return hoursSpent;}
    public void setHoursSpent(int hoursSpent) {this.hoursSpent = hoursSpent;}

    public Timestamp getFinishDate() {return finishDate;}
    public void setFinishDate(Timestamp finishDate) {this.finishDate = finishDate;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public int getCreatedByUserId() {return createdByUserId;}
    public void setCreatedByUserId(int createdByUserId) {this.createdByUserId = createdByUserId;}

    public int getAssignedToUserId() {return assignedToUserId;}
    public void setAssignedToUserId(int assignedToUserId) {this.assignedToUserId = assignedToUserId;}
}
