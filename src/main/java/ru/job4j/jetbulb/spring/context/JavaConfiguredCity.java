package ru.job4j.jetbulb.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.job4j.jetbulb.spring.context.city.City;
import ru.job4j.jetbulb.spring.context.city.ElectricitySystem;
import ru.job4j.jetbulb.spring.context.city.IndustrialDestrict;
import ru.job4j.jetbulb.spring.context.city.PipelineSystem;

public class JavaConfiguredCity {
    /**
     * Здесь рассмотрен пример ухода от описания конфигурации xml (логировать, дебажить нельзя)
     * Используем аннотации:
     *
     * @Bean - компоненты, которые нужно создать. Имя метода - идентификатор
     * @Configuration
     * @ComponentScan
     * @Component
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = context.getBean(City.class);
        System.out.println(city);
    }
}

@Configuration
class CityConfiguration {
    @Bean
    public ElectricitySystem electricitySystem() {
        return new ElectricitySystem();
    }

    @Bean
    public PipelineSystem pipelineSystem() {
        return new PipelineSystem();
    }

    @Bean
    public IndustrialDestrict industrialDestrict() {
        return new IndustrialDestrict();
    }

    @Bean
    public City city(ElectricitySystem electricitySystem,
                     PipelineSystem pipelineSystem,
                     IndustrialDestrict industrialDestrict) {
        return new City(electricitySystem, pipelineSystem, industrialDestrict);
    }
}
