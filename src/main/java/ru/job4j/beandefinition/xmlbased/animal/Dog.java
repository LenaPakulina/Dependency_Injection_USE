package ru.job4j.beandefinition.xmlbased.animal;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void postConstruct() {
        System.out.println("bean Dog method postConstruct()");
    }

    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}
