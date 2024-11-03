package com.design.patterns.builder;

public class DesktopComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public DesktopComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public ComputerBuilder buildProcessor(String processor) {
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(int memory) {
        return this;
    }

    @Override
    public ComputerBuilder buildStorage(int storage) {
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
