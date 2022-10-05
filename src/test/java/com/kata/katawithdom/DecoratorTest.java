package com.kata.katawithdom;

import com.kata.katawithdom.decorator.Bauble;
import com.kata.katawithdom.decorator.ChristmasTree;
import com.kata.katawithdom.decorator.ChristmasTreeImpl;
import com.kata.katawithdom.decorator.StarTreeTopper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test

    public void test1(){
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        StarTreeTopper starTreeTopper = new StarTreeTopper(christmasTree);

        Assertions
                .assertEquals(
                "This is a Christmas tree decorated with a StarTreeTopper",
                starTreeTopper.decorate());
    }

    @Test
    public void test2(){
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        Bauble bauble = new Bauble(christmasTree);

        Assertions
                .assertEquals(
                        "This is a Christmas tree decorated with a bauble",
                        bauble.decorate());
    }
}
