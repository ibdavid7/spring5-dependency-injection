package com.springframework.spring5dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private static final String NAME = "Steve";

    public String sayHello() {

        System.out.println("Hello World! From " + NAME);

        return "greetings to you";

    }

}
