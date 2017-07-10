package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/9/17.
 */
@Entity(name = "Readability")
public class ReadabilityEntity {
    private Long id;
    private String name;

    public ReadabilityEntity(){super();}

    public ReadabilityEntity(String name) {
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
