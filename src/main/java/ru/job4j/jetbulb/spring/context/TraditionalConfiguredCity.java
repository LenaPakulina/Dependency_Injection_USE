package ru.job4j.jetbulb.spring.context;

import ru.job4j.jetbulb.spring.context.city.City;
import ru.job4j.jetbulb.spring.context.city.ElectricitySystem;
import ru.job4j.jetbulb.spring.context.city.IndustrialDestrict;
import ru.job4j.jetbulb.spring.context.city.PipelineSystem;

public class TraditionalConfiguredCity {
    /**
     * Традиционный подход к конфигурированию объектов во время работы приложения
     */
    public static void main(String[] args) {
        /**
         * Конструируем, инициализируем и собираем объекты бизнес логики вручную
         */
        ElectricitySystem electricitySystem = new ElectricitySystem();
        PipelineSystem pipelineSystem = new PipelineSystem();
        IndustrialDestrict industrialDestrict = new IndustrialDestrict();

        /**
         * Собираем все вместе для создания большего объекта
         */
        City city = new City(electricitySystem, pipelineSystem, industrialDestrict);
        System.out.println(city);
    }
}
