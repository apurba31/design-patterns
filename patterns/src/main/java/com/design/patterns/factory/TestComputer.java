package com.design.patterns.factory;

public class TestComputer {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2", "256", "2.4GHz");
        System.out.println("PC Config::" + pc);
    }
}
