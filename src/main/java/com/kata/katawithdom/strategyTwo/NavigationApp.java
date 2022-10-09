package com.kata.katawithdom.strategyTwo;

import com.kata.katawithdom.strategyTwo.strategies.NavigationStrategy;

public class NavigationApp {

    NavigationStrategy navigationStrategy;

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public int calculateTime(){
        return navigationStrategy.calculateTime();
    }
}
