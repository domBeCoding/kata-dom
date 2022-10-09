package com.kata.katawithdom.strategyTwo.strategies;

public class Land implements NavigationStrategy{

    int distance;
    int averageSpeed;
    int carsOnRoad;

    public int calculateTrafficDelay(){
        return (int) (carsOnRoad * 0.1);
    }

    @Override
    public int calculateTime() {
        int fastestTimeScenario = (distance/averageSpeed);
        int trafficTimeDelay = calculateTrafficDelay();
        return fastestTimeScenario + trafficTimeDelay;
    }

    public Land(int distance, int averageSpeed, int carsOnRoad) {
        this.distance = distance;
        this.averageSpeed = averageSpeed;
        this.carsOnRoad = carsOnRoad;
    }
}
