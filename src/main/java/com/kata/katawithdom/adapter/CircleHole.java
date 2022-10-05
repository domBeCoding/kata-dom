package com.kata.katawithdom.adapter;

public class CircleHole {

    private int radius;

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(CirclePlug circlePlug) {
        return (radius >= circlePlug.getRadius());
    }

    public int getRadius() {
        return radius;
    }


}
