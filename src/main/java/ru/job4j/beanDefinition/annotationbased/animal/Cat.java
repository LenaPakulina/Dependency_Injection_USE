package ru.job4j.beanDefinition.annotationbased.animal;

public class Cat {
    private String name;

    public Cat() {
    }

    public static Cat createCat(String name) {
        Cat cat = new Cat();
        cat.name = name;
        return cat;
    }

    public String getName() {
        return name;
    }
}
