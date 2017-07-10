package com.example.awtsocialnetwork.repository;

import com.example.awtsocialnetwork.entity.FilterEntity;
import com.example.awtsocialnetwork.entity.TweetEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sabiralizada on 7/10/17.
 */
public interface FilterRepository extends CrudRepository<FilterEntity,Long> {
}
