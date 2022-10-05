package com.kata.katawithdom.singleton;

public class LazyInitialisedSingleton {

    private static LazyInitialisedSingleton lazyInitialisedSingleton;

    private LazyInitialisedSingleton() {}

    public static LazyInitialisedSingleton getSingleton() {
        if(lazyInitialisedSingleton == null){
            lazyInitialisedSingleton = new LazyInitialisedSingleton();
        }
        return lazyInitialisedSingleton;
    }
}
