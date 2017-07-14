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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/topic")
    public @ResponseBody Iterable<TweetEntity> getTopicFilter(@RequestParam("topicID") String id) {
        // This returns a JSON or XML with the users
        return tweetRepository.findByTopicId(Long.parseLong(id));
    }

    @GetMapping(path="/language")
    public @ResponseBody Iterable<TweetEntity> getLanguageFilter(@RequestParam("languageID") String id) {
        // This returns a JSON or XML with the users
        return tweetRepository.findByLanguageId(Long.parseLong(id));
    }

    @GetMapping(path="/filterGender")
    public @ResponseBody Iterable<TweetEntity> getGenderFilter(@RequestParam("genderID") String id) {
        // This returns a JSON or XML with the users
        return tweetRepository.findByGenderId(Long.parseLong(id));
    }

    @GetMapping(path="/filterSentiment")
    public @ResponseBody Iterable<TweetEntity> getSentimentFilter(@RequestParam("sentimentID") String id) {
        // This returns a JSON or XML with the users
        return tweetRepository.findBySentimentId(Long.parseLong(id));
    }

/*    @GetMapping(path="/filterUser")
    public @ResponseBody Iterable<TweetEntity> getUserFilter(@RequestParam("userID") String id) {
        // This returns a JSON or XML with the users
        return tweetRepository.findByTwitterUserID(Long.parseLong(id));
    } */
}
