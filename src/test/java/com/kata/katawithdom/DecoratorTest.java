package com.kata.katawithdom;

import com.kata.katawithdom.decorator.decorators.Bauble;
import com.kata.katawithdom.decorator.ChristmasTree;
import com.kata.katawithdom.decorator.ChristmasTreeImpl;
import com.kata.katawithdom.decorator.decorators.CandyCane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void shouldReturnADecoratedChristmasTree() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        Assertions.assertEquals("This is a Christmas tree decorated with a star", christmasTree.decorate());
    }

    @Test
    public void shouldReturnAChristmasTreeDecoratedWithACandyCane() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        CandyCane candyCane = new CandyCane(christmasTree);

        Assertions
                .assertEquals(
                        "This is a Christmas tree decorated with a star and a candy cane",
                        candyCane.decorate());
    }

    @Test
    public void shouldReturnAChristmasTreeDecoratedWithABauble() {
        ChristmasTree christmasTree = new Bauble(new ChristmasTreeImpl());

        Assertions
                .assertEquals(
                        "This is a Christmas tree decorated with a star and a bauble",
                        christmasTree.decorate());
    }

    @Test
    public void shouldReturnAChristmasTreeDecoratedWithABaubleAndACandyCane() {
        ChristmasTree christmasTree = new CandyCane(new Bauble(new ChristmasTreeImpl()));

        Assertions
                .assertEquals(
                        "This is a Christmas tree decorated with a star and a bauble and a candy cane",
                        christmasTree.decorate());
    }
}
