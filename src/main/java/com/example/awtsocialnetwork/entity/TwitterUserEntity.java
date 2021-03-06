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
    private Long twitterId;
    private String profileBackgroundImageUrl;

    public TwitterUserEntity(){super();}

    public TwitterUserEntity(String fullName, String screeName, Long twitterId, String profileBackgroundImageUrl) {
        this.fullName = fullName;
        this.screeName = screeName;
        this.twitterId = twitterId;
        this.profileBackgroundImageUrl=profileBackgroundImageUrl;
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

    public Long getTwitterId() {
        return twitterId;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public void setTwitterId(Long twitterId) {
        this.twitterId = twitterId;
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
