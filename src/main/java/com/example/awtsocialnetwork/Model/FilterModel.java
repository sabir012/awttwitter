package com.example.awtsocialnetwork.Model;

import com.example.awtsocialnetwork.entity.*;

/**
 * Created by sabiralizada on 7/11/17.
 */
public class FilterModel {
    private Iterable<TopicEntity> topics;
    private Iterable<GenderEntity> genders;
    private Iterable<SentimentEntity> sentiments;
    private Iterable<TwitterUserEntity> twitterUsers;
    private Iterable<LanguageEntity> languages;

    public FilterModel() {
        super();
    }

    public Iterable<TopicEntity> getTopics() {
        return topics;
    }

    public void setTopics(Iterable<TopicEntity> topics) {
        this.topics = topics;
    }

    public Iterable<GenderEntity> getGenders() {
        return genders;
    }

    public void setGenders(Iterable<GenderEntity> genders) {
        this.genders = genders;
    }

    public Iterable<SentimentEntity> getSentiments() {
        return sentiments;
    }

    public void setSentiments(Iterable<SentimentEntity> sentiments) {
        this.sentiments = sentiments;
    }

    public Iterable<TwitterUserEntity> getTwitterUsers() {
        return twitterUsers;
    }

    public void setTwitterUsers(Iterable<TwitterUserEntity> twitterUsers) {
        this.twitterUsers = twitterUsers;
    }

    public Iterable<LanguageEntity> getLanguages() {
        return languages;
    }

    public void setLanguages(Iterable<LanguageEntity> languages) {
        this.languages = languages;
    }
}
