package com.starwars.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.starwars.controller", "com.starwars.service", "com.starwars.dao" })
@SpringBootApplication
public class DemoApplication
{
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}