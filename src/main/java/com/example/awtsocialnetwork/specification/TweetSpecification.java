package com.example.awtsocialnetwork.specification;

import com.example.awtsocialnetwork.entity.TweetEntity;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by sabiralizada on 7/15/17.
 */
public class TweetSpecification {
    public static Specification<TweetEntity> withGender(Long gender) {
        if(gender == null) {
            return null;
        } else {
            return (root, query, cb) -> cb.equal(root.get("gender"), gender);
        }
    }

    public static Specification<TweetEntity> withLanguage(Long language) {
        if(language == null) {
            return null;
        } else {
            return (root, query, cb) -> cb.equal(root.get("language"), language);
        }
    }

    public static Specification<TweetEntity> withSentiment(Long sentiment) {
        if(sentiment == null) {
            return null;
        } else {
            return (root, query, cb) -> cb.equal(root.get("sentiment"), sentiment);
        }
    }

    public static Specification<TweetEntity> withTopic(Long topic) {
        if(topic == null) {
            return null;
        } else {
            return (root, query, cb) -> cb.equal(root.get("topic"), topic);
        }
    }

    public static Specification<TweetEntity> withUser(Long user) {
        if(user == null) {
            return null;
        } else {
            return (root, query, cb) -> cb.equal(root.get("twitterUser"), user);
        }
    }
}
