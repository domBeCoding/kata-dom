package com.kata.katawithdom.strategyOne.strategies;

public class CannotFly implements Flys{
    @Override
    public void fly() {
        System.out.println("This animal cannot fly");
    }
}
