package com.design.patterns.builder;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder desktopBuilder = new DesktopComputerBuilder();
        ComputerDirector director = new ComputerDirector(desktopBuilder);
        Computer desktop = director.constructComputer();

        System.out.println(desktop);
    }
}
