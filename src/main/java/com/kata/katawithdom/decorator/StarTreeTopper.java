package com.kata.katawithdom.decorator;

public class StarTreeTopper extends Decorator{

    public StarTreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    @Override
    public String decorate(){
        return super.decorate() + " decorated with a StarTreeTopper";
    }
}
