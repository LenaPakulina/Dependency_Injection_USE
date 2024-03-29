package ru.job4j.jetbulb.spring.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.job4j.jetbulb.spring.context.city.City;

public class XmlConfiguredCity {
    /**
     * При данном подходе контроль над конструированием, инициализацией, сборкой бизнес логики
     * полностью возлагается на специализированный фреймворк, который полагается
     * на простую мета информацию
     *
     * Так называемый Spring IoC Container самостоятельно делает эти вещи,
     * базируясь на предварительно описанную мета-конфигурацию в xml-формате
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("city-context.xml");
        /**
         * Получение готового для работы объекта из контейнера
         */
        City city = context.getBean(City.class);
        System.out.println(city);
    }
}
