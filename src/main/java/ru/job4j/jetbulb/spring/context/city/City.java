package ru.job4j.jetbulb.spring.context.city;

import org.springframework.beans.factory.annotation.Autowired;

public class City {
    private ElectricitySystem electricitySystem;
    private PipelineSystem pipelineSystem;
    private IndustrialDestrict industrialDestrict;

    public City(@Autowired ElectricitySystem electricitySystem,
                @Autowired PipelineSystem pipelineSystem,
                @Autowired(required = true) IndustrialDestrict industrialDestrict) {
        this.electricitySystem = electricitySystem;
        this.pipelineSystem = pipelineSystem;
        this.industrialDestrict = industrialDestrict;
    }

    @Override
    public String toString() {
        return "City{"
                + "electricitySystem=" + electricitySystem
                + ", pipelineSystem=" + pipelineSystem
                + '}';
    }
}
