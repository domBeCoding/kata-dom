package com.kata.katawithdom;

import com.kata.katawithdom.strategyOne.Bird;
import com.kata.katawithdom.strategyOne.Dog;
import com.kata.katawithdom.strategyOne.strategies.CanFly;
import com.kata.katawithdom.strategyOne.strategies.CannotFly;
import com.kata.katawithdom.strategyTwo.NavigationApp;
import com.kata.katawithdom.strategyTwo.strategies.Air;
import com.kata.katawithdom.strategyTwo.strategies.Land;
import com.kata.katawithdom.strategyTwo.strategies.Water;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    Dog dog = new Dog();
    Bird bird = new Bird();


    @Test
    public void dogCannotFly(){
        dog.setFlyingAbility(new CannotFly());
        dog.attemptToFly();
    }

    @Test
    public void BirdCanFly(){
        bird.setFlyingAbility(new CanFly());
        bird.attemptToFly();
    }

    //--------------------------------------------

    NavigationApp navigationApp = new NavigationApp();

    @Test
    public void calculateTimeDurationForUberCar(){

    }

    @Test
    public void calculateTimeDurationForUberBoat(){

    }

    @Test
    public void calculateTimeForUberHelicopter(){

    }
}
