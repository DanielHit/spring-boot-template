package com.qiezi.controller;

import com.qiezi.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {

    private static final String template = "Hello-what, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Value("${username}")
    private String userName;

    @Autowired
    private Config config;

    @RequestMapping("/")
    public Map<String, Object> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("list", config.getServers());
        resultMap.put("username",userName);
        return resultMap;
    }

}
