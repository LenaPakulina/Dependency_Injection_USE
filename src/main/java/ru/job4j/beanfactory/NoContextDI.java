package ru.job4j.beanfactory;

import ru.job4j.beanfactory.data.StartUI;
import ru.job4j.beanfactory.data.Store;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        StartUI ui = new StartUI(store);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
