package com.example.awtsocialnetwork.controller;

import com.example.awtsocialnetwork.Model.FilterModel;
import com.example.awtsocialnetwork.entity.FilterEntity;
import com.example.awtsocialnetwork.entity.TwitterUserEntity;
import com.example.awtsocialnetwork.repository.FilterRepository;
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
    private TwitterUserRepository userRepository;

    @GetMapping(path="/")
    public @ResponseBody FilterModel getAllFilters() {
        // This returns a JSON or XML with the users
        return filterService.getAllFilter();
    }
}
