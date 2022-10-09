package com.kata.katawithdom.strategyTwo.strategies;

public class Water implements NavigationStrategy{

    int distance;
    int averageSpeed;
    int opposingWindSpeed;
    int averageWaveHeight;

    public int calculateWindTurbulenceDelay(){
        return (int) (opposingWindSpeed * 0.3);
    }

    public int calculateWaveTimeDelay(){
        return (int) (averageWaveHeight * 0.7);
    }

    @Override
    public int calculateTime() {
        int fastestTimeScenario = (distance/averageSpeed);
        int windTurbulenceTimeDelay = calculateWindTurbulenceDelay();
        int waveCurrentTimeDelay = calculateWaveTimeDelay();
        return fastestTimeScenario
                + windTurbulenceTimeDelay
                + waveCurrentTimeDelay;
    }

    public Water(int distance, int averageSpeed, int opposingWindSpeed, int averageWaveHeight) {
        this.distance = distance;
        this.averageSpeed = averageSpeed;
        this.opposingWindSpeed = opposingWindSpeed;
        this.averageWaveHeight = averageWaveHeight;
    }
}
