package com.kata.katawithdom.strategyOne.strategies;

public class CanFly implements Flys{

    @Override
    public void fly() {
        System.out.println("This animal can fly");
    }
}
