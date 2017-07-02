package com.example.awtsocialnetwork.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/3/17.
 */
@Entity
public class Person {
    private Long id;
    private String firstName;
    private String lastName;


    @Id
    @GeneratedValue
    public Long getID(){
        return id;
    }

    public void setID(Long id){
        this.id=id;
    }

    @Column(name = "FirstName")
    public String getFirtsName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    @Column(name = "LastName")
    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
