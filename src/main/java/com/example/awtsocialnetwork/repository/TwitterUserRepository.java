package com.example.awtsocialnetwork.repository;

import com.example.awtsocialnetwork.entity.TwitterUserEntity;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

/**
 * Created by sabiralizada on 7/9/17.
 */
public interface TwitterUserRepository  extends CrudRepository<TwitterUserEntity,Long>{
    TwitterUserEntity findById(Long id);
    Iterable<TwitterUserEntity> findAll();
}
