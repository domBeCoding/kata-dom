package com.kata.katawithdom.decorator;

public class Bauble extends Decorator {


    public Bauble(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate(){
        return super.decorate() + " decorated with a bauble";
    }
}
