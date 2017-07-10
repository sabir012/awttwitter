package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/9/17.
 */
@Entity(name = "TwitterUser")
public class TwitterUserEntity {
    private Long id;
    private String fullName;
    private String screeName;

    public TwitterUserEntity(){super();}

    public TwitterUserEntity(String fullName, String screeName) {
        this.fullName = fullName;
        this.screeName = screeName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getScreeName() {
        return screeName;
    }

    public void setScreeName(String screeName) {
        this.screeName = screeName;
    }
}
