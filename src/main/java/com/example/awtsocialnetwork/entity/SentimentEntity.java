package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/9/17.
 */
@Entity(name = "Sentiment")
public class SentimentEntity {
    private int minValue;
    private int maxValue;
    private Long id;
    private String name;

    public SentimentEntity() {
        super();
    }

    public SentimentEntity(int minValue, int maxValue, String name) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public int getMinValue() {
        return minValue;
    }
    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}

