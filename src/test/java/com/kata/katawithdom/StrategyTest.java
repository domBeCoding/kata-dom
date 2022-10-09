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
        navigationApp.setNavigationStrategy(new Land(200, 40, 100));
        int timeDuration = navigationApp.calculateTime();
        System.out.println(timeDuration);
    }

    @Test
    public void calculateTimeDurationForUberBoat(){
        navigationApp.setNavigationStrategy(new Water(3000, 60, 40, 40));
        int timeDuration = navigationApp.calculateTime();
        System.out.println(timeDuration);
    }

    @Test
    public void calculateTimeForUberHelicopter(){
        navigationApp.setNavigationStrategy(new Air(5000, 100, 30));
        int timeDuration = navigationApp.calculateTime();
        System.out.println(timeDuration);
    }
}
