package com.design.patterns.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Shape circleProtype = new Circle("red");
        Shape secondCircle = new Circle("purple");
        ShapeClient client = new ShapeClient(circleProtype);
        ShapeClient secondClient = new ShapeClient(secondCircle);
        Shape redCircle = client.createShape();
        Shape purpleCircle = secondClient.createShape();
        redCircle.draw();
        purpleCircle.draw();
    }
}
