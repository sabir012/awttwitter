package com.example.awtsocialnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sabiralizada on 7/3/17.
 */
@Entity
public class Filter {
    private Long id;
    private String tableName;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
