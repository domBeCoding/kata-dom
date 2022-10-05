package com.kata.katawithdom.factory;

public class ShapeFactory {

    public Shape getShape(String shape){
        return switch (shape){
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }
}
