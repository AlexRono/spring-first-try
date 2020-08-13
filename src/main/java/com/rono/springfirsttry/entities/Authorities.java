package com.rono.springfirsttry.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities {

    //table fields below
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "authority")
    private String authority;

    //getters and setters

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getAuthority() {return authority;}
    public void setAuthority(String authority) {this.authority = authority;}
}
