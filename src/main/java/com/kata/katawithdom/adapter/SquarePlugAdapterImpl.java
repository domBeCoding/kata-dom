package com.kata.katawithdom.adapter;

public class SquarePlugAdapterImpl extends CirclePlug implements SquarePlugAdapter{

    SquarePlug squarePlug;

    public SquarePlugAdapterImpl(SquarePlug squarePlug) {
        super(0);
        this.squarePlug = squarePlug;
    }

    @Override
    public double getRadius() {
//        System.out.println(squarePlug.getWidth() * Math.sqrt(2) / 2);
        return squarePlug.getWidth() * Math.sqrt(2) / 2;
    }
}
