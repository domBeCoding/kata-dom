package com.kata.katawithdom;

import com.kata.katawithdom.adapter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void givenCircleHole_circlePlugFits() {
        CircleHole circleHole = new CircleHole(10);
        CirclePlug circlePlug = new CirclePlug(10);

        Assertions.assertTrue(circleHole.fits(circlePlug));
    }

    @Test
    public void givenCircleHole_squarePlugDoesNotFit_CompilationError() {
        CircleHole circleHole = new CircleHole(10);
        SquarePlug squarePlug = new SquarePlug(5);
//
//        circleHole.fits(squarePlug);
    }

    @Test
    public void givenCircleHole_andAdapterIsUsed_squarePlugFits() {
        CircleHole circleHole = new CircleHole(10);
        SquarePlug squarePlug = new SquarePlug(10.142);

        SquarePlugAdapterImpl adapter = new SquarePlugAdapterImpl(squarePlug);
        Assertions.assertTrue(circleHole.fits(adapter));
    }
}
