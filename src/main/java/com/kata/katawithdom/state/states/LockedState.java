package com.kata.katawithdom.state.states;

import com.kata.katawithdom.state.Phone;

public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomeButton() {
        phone.fingerprint();
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
