package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/3/17.
 */
@SuppressWarnings("ALL")
@Entity
public class FollowerMap {
    private Long id;
    private Long userID;
    private Long followerID;
    private Long followerTypeID;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getFollowerID() {
        return followerID;
    }
    public void setFollowerID(Long followerID) {
        this.followerID = followerID;
    }

    public Long getFollowerTypeID() {
        return followerTypeID;
    }
    public void setFollowerTypeID(Long followerTypeID) {
        this.followerTypeID = followerTypeID;
    }
}
