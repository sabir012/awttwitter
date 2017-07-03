package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/3/17.
 */
@SuppressWarnings("ALL")
@Entity
public class Topic {
    private Long id;
    private String name;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
