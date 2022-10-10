package com.kata.katawithdom.adapter;

public class CircleHole {

    private int radius;

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(CirclePlug circlePlug) {
        return (circlePlug.getRadius() <= radius);
    }

    public int getRadius() {
        return radius;
    }
}
