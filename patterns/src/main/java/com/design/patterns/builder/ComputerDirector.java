package com.design.patterns.builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    public Computer constructComputer(){
        return computerBuilder
                .buildProcessor("Intel i3")
                .buildMemory(64)
                .buildStorage(512)
                .build();
    }
}
