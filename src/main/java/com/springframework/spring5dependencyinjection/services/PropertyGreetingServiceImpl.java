package com.springframework.spring5dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}