package com.epam.spring;

import com.epam.spring.config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        System.out.println("--------------------------------------");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------------------");
        context.close();
    }

}
