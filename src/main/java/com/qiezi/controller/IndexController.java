package com.qiezi.controller;

import com.qiezi.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
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
    public Map<String, Object> greeting(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("list", config.getServers());
        resultMap.put("username", userName);
        model.addAttribute("object", new Config());
        return resultMap;
    }

}
