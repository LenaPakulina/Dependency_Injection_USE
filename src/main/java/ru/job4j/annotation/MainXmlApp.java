package ru.job4j.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:app-context-xml.xml");
        Man man = context.getBean(Man.class);
        man.print();
    }
}
