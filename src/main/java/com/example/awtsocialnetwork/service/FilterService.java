package com.example.awtsocialnetwork.service;

import com.example.awtsocialnetwork.Model.FilterModel;
import com.example.awtsocialnetwork.entity.FilterEntity;
import com.example.awtsocialnetwork.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sabiralizada on 7/10/17.
 */
@Service
public class FilterService {
    @Autowired
    private FilterRepository filterRepository;
    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private LanguageRepository languageRepository;
    @Autowired
    private GenderRepository genderRepository;
    @Autowired
    private TwitterUserRepository userRepository;
    @Autowired
    private SentimentRepository sentimentRepository;


    public FilterModel getAllFilter(){
        Iterable<FilterEntity> filterEntities= filterRepository.findAll();

        FilterModel filterModel = new FilterModel();

        for (FilterEntity filter:filterEntities) {
            switch (filter.getName()){
                case "topic": filterModel.setTopics(topicRepository.findAll()); break;
                case "language": filterModel.setLanguages(languageRepository.findAll()); break;
                case "gender": filterModel.setGenders(genderRepository.findAll()); break;
                case "twitter_user": filterModel.setTwitterUsers(userRepository.findAll()); break;
                case "sentiment": filterModel.setSentiments(sentimentRepository.findAll()); break;
                default:
                    System.out.println("NO SUCH TABLE IN DATABASE");
            }
        }

        return filterModel;
    }
}
