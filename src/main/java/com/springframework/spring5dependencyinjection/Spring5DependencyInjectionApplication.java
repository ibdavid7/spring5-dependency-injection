package com.springframework.spring5dependencyinjection;

import com.springframework.spring5dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Spring5DependencyInjectionApplication.class, args);

        MyController myController = (MyController) appContext.getBean("myController");

        String greetings = myController.getGreeting();

        System.out.println(greetings);

        System.out.println("--------Property Injected Controller-----------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------Setter Injected Controller-----------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) appContext.getBean(
                "setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------Constructor Injected Controller-----------");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) appContext.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("--------Primary Service-----------");

        System.out.println(myController.getGreeting());

        System.out.println("--------I18N Service and Profiles-----------");

        I18nController i18nController = (I18nController) appContext.getBean("i18nController");
        System.out.println(i18nController.getGreeting());


    }

}
