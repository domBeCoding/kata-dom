package com.kata.katawithdom.strategyTwo.strategies;

public class Air implements NavigationStrategy {

    int distance;
    int averageSpeed;
    int opposingWindSpeed;

    public int calculateWindTurbulenceDelay(){
        return (int) (opposingWindSpeed * 0.4);
    }
    @Override
    public int calculateTime() {
        int fastestTimeScenario = (distance/averageSpeed);
        int windTurbulenceTimeDelay = calculateWindTurbulenceDelay();
        return fastestTimeScenario + windTurbulenceTimeDelay;
    }

    public Air(int distance, int averageSpeed, int opposingWindSpeed) {
        this.distance = distance;
        this.averageSpeed = averageSpeed;
        this.opposingWindSpeed = opposingWindSpeed;
    }

}
