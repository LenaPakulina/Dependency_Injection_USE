package ru.job4j.di.tracker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di.tracker");
        context.refresh();
        StartUI startUI1 = context.getBean(StartUI.class);
        startUI1.add("Value_1");
        startUI1.print();
        StartUI startUI2 = context.getBean(StartUI.class);
        startUI2.add("Value_2");
        startUI2.print();
    }
}
