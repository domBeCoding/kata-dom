package com.kata.katawithdom;

import com.kata.katawithdom.factory.ShapeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void whenCircleShapeIsSpecified_thenReturnCircleObject() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Assertions.assertEquals(1, shapeFactory.getShape("circle").getEdgeCount());
        Assertions.assertEquals(4, shapeFactory.getShape("square").getEdgeCount());
    }
}
