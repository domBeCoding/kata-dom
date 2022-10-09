package com.kata.katawithdom.decorator.decorators;

import com.kata.katawithdom.decorator.ChristmasTree;

public class Bauble extends Decorator {


    public Bauble(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate(){
        return super.decorate() + " and a bauble";
    }
}
