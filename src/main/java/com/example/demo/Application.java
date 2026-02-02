package com.example.demo;

import config.ConfigClass;
import entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();
    }

}
