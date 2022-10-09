package com.kata.katawithdom.strategyOne;

import com.kata.katawithdom.strategyOne.strategies.Flys;

public class Animal {

    String name;
    int height;
    int weight;
    Flys flys;

    public void attemptToFly(){
        flys.fly();
    }

    public void setFlyingAbility(Flys flys) {
        this.flys = flys;
    }
}
