package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheney on 2017/6/15.
 */
@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("")
    public String index(String name) {

        return "This is caller service";
    }




}
