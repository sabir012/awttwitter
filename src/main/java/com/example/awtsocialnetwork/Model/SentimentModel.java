package com.example.awtsocialnetwork.Model;

/**
 * Created by sabiralizada on 7/15/17.
 */
public class SentimentModel {
    private Long id;
    private String name;
    private Float percentage;

    public SentimentModel(Long id, String name, Float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
