package ru.job4j.beanFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.beanFactory.data.StartUI;
import ru.job4j.beanFactory.data.Store;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class, StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
