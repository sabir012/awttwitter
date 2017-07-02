package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by sabiralizada on 7/3/17.
 */
@Entity
public class Tweet {
    private Long id;
    private String content;
    private Long tweeterUserId;
    private Long topicId;
    private Long sentimentId;
    private Float sentimentValue;
    private Long genderId;
    private Long languageId;
    private Long categoryId;
    private Long contentTypeId;
    private Long subjectivityId;
    private Long readabilityId;
    private Date date;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Long getTweeterUserId() {
        return tweeterUserId;
    }
    public void setTweeterUserId(Long tweeterUserId) {
        this.tweeterUserId = tweeterUserId;
    }

    public Long getTopicId() {
        return topicId;
    }
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getSentimentId() {
        return sentimentId;
    }
    public void setSentimentId(Long sentimentId) {
        this.sentimentId = sentimentId;
    }

    public Float getSentimentValue() {
        return sentimentValue;
    }
    public void setSentimentValue(Float sentimentValue) {
        this.sentimentValue = sentimentValue;
    }

    public Long getLanguageId() {
        return languageId;
    }
    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public Long getGenderId() {
        return genderId;
    }
    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getContentTypeId() {
        return contentTypeId;
    }
    public void setContentTypeId(Long contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Long getSubjectivityId() {
        return subjectivityId;
    }
    public void setSubjectivityId(Long subjectivityId) {
        this.subjectivityId = subjectivityId;
    }

    public Long getReadabilityId() {
        return readabilityId;
    }
    public void setReadabilityId(Long readabilityId) {
        this.readabilityId = readabilityId;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}