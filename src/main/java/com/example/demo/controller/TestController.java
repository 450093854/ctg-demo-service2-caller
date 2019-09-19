package com.example.demo.controller;

import com.example.demo.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheney on 2017/6/15.
 */
@RestController
public class TestController {

    @Value("${helloservice.url}")
    String helloUrl;

    @Value("${byeservice.url}")
    String byeUrl;

    @RequestMapping("/hello")
    public String hello(){

        return HttpUtils.httpGet(helloUrl);
    }

    @RequestMapping("/bye")
    public String bye(){

        return HttpUtils.httpGet(byeUrl);
    }
}