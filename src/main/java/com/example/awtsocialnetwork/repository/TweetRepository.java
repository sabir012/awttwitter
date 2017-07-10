package com.example.awtsocialnetwork.repository;

import com.example.awtsocialnetwork.entity.TweetEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sabiralizada on 7/9/17.
 */
public interface TweetRepository extends CrudRepository<TweetEntity,Long> {
    List<TweetEntity> findById(Long id);
}
