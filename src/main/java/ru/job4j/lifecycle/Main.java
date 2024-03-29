package ru.job4j.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.jetbulb.spring.context.city.City;
import ru.job4j.lifecycle.config.Config;
import ru.job4j.lifecycle.model.Product;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("lifecycle");
        Config product = context.getBean(Config.class);
        context.close();
    }
}
