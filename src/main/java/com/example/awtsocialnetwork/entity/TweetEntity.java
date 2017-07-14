package com.example.awtsocialnetwork.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sabiralizada on 7/9/17.
 */
@Entity(name = "Tweet")
public class TweetEntity {
    private Long id;
    private String content;
    private TwitterUserEntity user;
    private TopicEntity topic;
    private SentimentEntity sentiment;
    private GenderEntity gender;
    private LanguageEntity language;
    private EducationalTypeEntity educationalType;
    private CommercialTypeEntity commercialType;
    private AdultContentTypeEntity contentType;
    private SubjectivityEntity subjectivity;
    private ReadabilityEntity readability;
    private Date date;
    private Long twitterTweetId;

    public TweetEntity(){
        super();
    }

    public TweetEntity(String content, TwitterUserEntity user, TopicEntity topic, SentimentEntity sentiment, GenderEntity gender, LanguageEntity language, EducationalTypeEntity educationalType, CommercialTypeEntity commercialType, AdultContentTypeEntity contentType, SubjectivityEntity subjectivity, ReadabilityEntity readability, Date date, Long twitterTweetId) {
        this.content = content;
        this.user = user;
        this.topic = topic;
        this.sentiment = sentiment;
        this.gender = gender;
        this.language = language;
        this.educationalType = educationalType;
        this.commercialType = commercialType;
        this.contentType = contentType;
        this.subjectivity = subjectivity;
        this.readability = readability;
        this.date = date;
        this.twitterTweetId = twitterTweetId;
    }

    public Long getTwitterTweetId() {
        return twitterTweetId;
    }

    public void setTwitterTweetId(Long twitterTweetId) {
        this.twitterTweetId = twitterTweetId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "TwitterUserID")
    public TwitterUserEntity getUserEntity() {
        return user;
    }

    public void setUserEntity(TwitterUserEntity userEntity) {
        this.user = userEntity;
    }

    @ManyToOne
    @JoinColumn(name = "TopicID")
    public TopicEntity getTopic() {
        return topic;
    }

    public void setTopic(TopicEntity topic) {
        this.topic = topic;
    }

    @ManyToOne
    @JoinColumn(name = "SentimentID")
    public SentimentEntity getSentiment() {
        return sentiment;
    }

    public void setSentiment(SentimentEntity sentiment) {
        this.sentiment = sentiment;
    }

    @ManyToOne
    @JoinColumn(name = "GenderID")
    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    @ManyToOne
    @JoinColumn(name = "LanguageID")
    public LanguageEntity getLanguage() {
        return language;
    }

    @ManyToOne
    @JoinColumn(name = "EducationalTypeID")
    public EducationalTypeEntity getEducationalType() {
        return educationalType;
    }

    @ManyToOne
    @JoinColumn(name = "ContentTypeID")
    public AdultContentTypeEntity getContentType() {
        return contentType;
    }

    public void setContentType(AdultContentTypeEntity contentType) {
        this.contentType = contentType;
    }

    public void setEducationalType(EducationalTypeEntity educationalType) {
        this.educationalType = educationalType;
    }

    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }

    @ManyToOne
    @JoinColumn(name = "SubjectivityID")
    public SubjectivityEntity getSubjectivity() {
        return subjectivity;
    }

    public void setSubjectivity(SubjectivityEntity subjectivity) {
        this.subjectivity = subjectivity;
    }

    @ManyToOne
    @JoinColumn(name = "ReadabilityID")
    public ReadabilityEntity getReadability() {
        return readability;
    }

    public void setReadability(ReadabilityEntity readability) {
        this.readability = readability;
    }

    @ManyToOne
    @JoinColumn(name = "CommercialTypeID")
    public CommercialTypeEntity getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(CommercialTypeEntity commercialType) {
        this.commercialType = commercialType;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
