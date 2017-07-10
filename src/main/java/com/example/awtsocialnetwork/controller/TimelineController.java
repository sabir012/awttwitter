package com.example.awtsocialnetwork.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sabiralizada on 7/6/17.
 */
@RestController
public class TimelineController {

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String Index(){
        return "index";
    }
}
