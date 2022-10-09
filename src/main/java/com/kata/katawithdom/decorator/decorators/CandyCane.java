package com.kata.katawithdom.decorator.decorators;

import com.kata.katawithdom.decorator.ChristmasTree;

public class CandyCane extends Decorator{

    public CandyCane(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    @Override
    public String decorate(){
        return super.decorate() + " and a candy cane";
    }
}
