package com.example.awtsocialnetwork.repository;

import com.example.awtsocialnetwork.entity.TweetEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sabiralizada on 7/9/17.
 */
public interface TweetRepository extends CrudRepository<TweetEntity,Long>,JpaSpecificationExecutor<TweetEntity> {
    Iterable<TweetEntity> findById(Long id);
    Iterable<TweetEntity> findByTopicId(Long id);
    Iterable<TweetEntity> findByLanguageId(Long id);
    Iterable<TweetEntity> findByGenderId(Long id);
    Iterable<TweetEntity> findBySentimentId(Long id);
    Iterable<TweetEntity> findByTwitterUserId(Long id);
}
