package com.qiezi.controller;

import com.qiezi.model.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {

    private static final String template = "Hello-what, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Value("${username}")
    private String userName;

    @RequestMapping("/index")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, userName));
    }

}
