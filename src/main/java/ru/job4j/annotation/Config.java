package ru.job4j.annotation;

import org.springframework.context.annotation.*;
import ru.job4j.annotation.pet.Dog;

@Configuration
@ComponentScan(basePackages = "ru.job4j.annotation")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    @Primary
    public Dog getAlfaDog() {
        return new Dog("Alfa");
    }

    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    public Dog someDog() {
        return new Dog("Dog");
    }
}
