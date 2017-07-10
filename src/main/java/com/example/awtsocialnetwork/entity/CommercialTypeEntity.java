package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/10/17.
 */
@Entity(name = "CommercialType")
public class CommercialTypeEntity {
    private Long id;
    private String name;

    public CommercialTypeEntity() {
        super();
    }

    public CommercialTypeEntity(String name) {
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
}
