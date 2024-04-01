package ru.job4j.beanDefinition.javacodebased.animal;

import org.springframework.stereotype.Component;

public class BirdFactory {
    public Canary getCanary(String name) {
        return new Canary(name);
    }

    public Parrot getParrot(String name) {
        return new Parrot(name);
    }
}
