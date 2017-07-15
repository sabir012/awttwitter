package com.example.awtsocialnetwork.controller;

import com.example.awtsocialnetwork.Model.FilterModel;
import com.example.awtsocialnetwork.entity.FilterEntity;
import com.example.awtsocialnetwork.entity.TweetEntity;
import com.example.awtsocialnetwork.entity.TwitterUserEntity;
import com.example.awtsocialnetwork.repository.FilterRepository;
import com.example.awtsocialnetwork.repository.TopicRepository;
import com.example.awtsocialnetwork.repository.TweetRepository;
import com.example.awtsocialnetwork.repository.TwitterUserRepository;
import com.example.awtsocialnetwork.service.FilterService;
import com.example.awtsocialnetwork.specification.TweetSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by sabiralizada on 7/6/17.
 */
@RestController
@RequestMapping("/timeline")
public class TimelineController {

    @Autowired
    private FilterService filterService;

    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping(path="/")
    public @ResponseBody FilterModel getAllFilters() {
        // This returns a JSON or XML with the users
        return filterService.getAllFilter();
    }

    @GetMapping(path = "/filter")
    public @ResponseBody Iterable<TweetEntity> getFilteredTweets(@RequestParam Map<String, String> requestParams) {
        String genderId = requestParams.get("genderID");
        String languageId = requestParams.get("languageID");
        String sentimentId = requestParams.get("sentimentID");
        String topicId = requestParams.get("topicID");
        String userId = requestParams.get("userID");
        return tweetRepository.findAll(Specifications
                .where(TweetSpecification.withGender(genderId == null ? null : Long.parseLong(genderId)))
                .and(TweetSpecification.withLanguage(languageId == null ? null : Long.parseLong(languageId)))
                .and(TweetSpecification.withSentiment(sentimentId == null ? null : Long.parseLong(sentimentId)))
                .and(TweetSpecification.withTopic(topicId == null ? null : Long.parseLong(topicId)))
                .and(TweetSpecification.withUser(userId == null ? null : Long.parseLong(userId))));
    }
}
