package com.example.awtsocialnetwork.Model;

/**
 * Created by sabiralizada on 7/15/17.
 */
public class DbAnalyzeModel {
    private Iterable<AnalyzeTempModel> sentiment;
    private Iterable<AnalyzeTempModel> topic;
    private Iterable<AnalyzeTempModel> language;
    private Iterable<AnalyzeTempModel> gender;
    private Iterable<AnalyzeTempModel> adultContentType;
    private Iterable<AnalyzeTempModel> commercialType;
    private Iterable<AnalyzeTempModel> educationalType;
    private Iterable<AnalyzeTempModel> readability;
    private Iterable<AnalyzeTempModel> subjectivity;

    public DbAnalyzeModel(){
        super();
    }

    public DbAnalyzeModel(Iterable<AnalyzeTempModel> sentiment, Iterable<AnalyzeTempModel> topic, Iterable<AnalyzeTempModel> language, Iterable<AnalyzeTempModel> gender, Iterable<AnalyzeTempModel> adultContentType, Iterable<AnalyzeTempModel> commercialType, Iterable<AnalyzeTempModel> educationalType, Iterable<AnalyzeTempModel> readability, Iterable<AnalyzeTempModel> subjectivity) {
        this.sentiment = sentiment;
        this.topic = topic;
        this.language = language;
        this.gender = gender;
        this.adultContentType = adultContentType;
        this.commercialType = commercialType;
        this.educationalType = educationalType;
        this.readability = readability;
        this.subjectivity = subjectivity;
    }

    public Iterable<AnalyzeTempModel> getSentiment() {
        return sentiment;
    }

    public void setSentiment(Iterable<AnalyzeTempModel> sentiment) {
        this.sentiment = sentiment;
    }

    public Iterable<AnalyzeTempModel> getTopic() {
        return topic;
    }

    public void setTopic(Iterable<AnalyzeTempModel> topic) {
        this.topic = topic;
    }

    public Iterable<AnalyzeTempModel> getLanguage() {
        return language;
    }

    public void setLanguage(Iterable<AnalyzeTempModel> language) {
        this.language = language;
    }

    public Iterable<AnalyzeTempModel> getGender() {
        return gender;
    }

    public void setGender(Iterable<AnalyzeTempModel> gender) {
        this.gender = gender;
    }

    public Iterable<AnalyzeTempModel> getAdultContentType() {
        return adultContentType;
    }

    public void setAdultContentType(Iterable<AnalyzeTempModel> adultContentType) {
        this.adultContentType = adultContentType;
    }

    public Iterable<AnalyzeTempModel> getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Iterable<AnalyzeTempModel> commercialType) {
        this.commercialType = commercialType;
    }

    public Iterable<AnalyzeTempModel> getEducationalType() {
        return educationalType;
    }

    public void setEducationalType(Iterable<AnalyzeTempModel> educationalType) {
        this.educationalType = educationalType;
    }

    public Iterable<AnalyzeTempModel> getReadability() {
        return readability;
    }

    public void setReadability(Iterable<AnalyzeTempModel> readability) {
        this.readability = readability;
    }

    public Iterable<AnalyzeTempModel> getSubjectivity() {
        return subjectivity;
    }

    public void setSubjectivity(Iterable<AnalyzeTempModel> subjectivity) {
        this.subjectivity = subjectivity;
    }
}
