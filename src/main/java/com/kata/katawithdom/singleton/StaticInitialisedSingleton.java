package com.kata.katawithdom.singleton;

public class StaticInitialisedSingleton {

    private static StaticInitialisedSingleton staticInitalisedSingleton;

    private StaticInitialisedSingleton() {}

    static{
        staticInitalisedSingleton = new StaticInitialisedSingleton();
        System.out.println("static block is called");
    }

    public static StaticInitialisedSingleton getStaticInitalisedSingleton() {
        return staticInitalisedSingleton;
    }
}

