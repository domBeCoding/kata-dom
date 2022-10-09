package com.kata.katawithdom.state.states;

import com.kata.katawithdom.state.Phone;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHomeButton();
    public abstract String onPowerButton();
}
