package com.kata.katawithdom.decorator;

public class Decorator implements ChristmasTree{

    ChristmasTree christmasTree;

    public Decorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();

    }
}
