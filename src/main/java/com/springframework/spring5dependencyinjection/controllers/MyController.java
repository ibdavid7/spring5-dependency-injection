package com.springframework.spring5dependencyinjection.controllers;

import com.springframework.spring5dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class MyController implements DisposableBean, InitializingBean {

    private static final String NAME = "Steve";
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {

        System.out.println("Hello World! From " + NAME);

        return greetingService.sayGreeting();

    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct method");
    }

    @PreDestroy
    public void preDestroyed() {
        System.out.println("Pre Destroyed method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set triggered");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean getting destroyed");
    }

}
