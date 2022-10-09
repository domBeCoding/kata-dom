package com.kata.katawithdom.state;

import com.kata.katawithdom.state.states.OffState;
import com.kata.katawithdom.state.states.State;

public class Phone {

    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    //-------------------------------

    public String lock(){
        return "Locking phone";
    }

    public String unlock(){
        return "Unlocking phone";
    }

    public String turnOn(){
        return "Switching phone on";
    }

    public String home(){
        return "Entering home screen";
    }

    public String fingerprint(){
        return "Scanning fingerprint: Successful";
    }
}
