package com.example.awtsocialnetwork.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/2/17.
 */
@SuppressWarnings("ALL")
@Entity
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private String password;
    private Date birthday;
    private Date lastSeenDate;
    private boolean _isOnline;
    private boolean _isActive;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastSeenDate() {
        return lastSeenDate;
    }
    public void setLastSeenDate(Date lastSeenDate) {
        this.lastSeenDate = lastSeenDate;
    }

    public boolean isOnline() {
        return _isOnline;
    }
    public void set_isOnline(boolean status){
        this._isOnline=status;
    }

    public boolean isActive() {
        return _isActive;
    }
    public void set_isActive(boolean status){
        this._isActive=status;
    }
}