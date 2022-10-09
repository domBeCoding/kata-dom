package com.kata.katawithdom.state.states;

import com.kata.katawithdom.state.Phone;

public class ReadyState extends State{
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomeButton() {
        return phone.home();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
