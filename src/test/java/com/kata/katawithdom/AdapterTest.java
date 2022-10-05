package com.kata.katawithdom;

import com.kata.katawithdom.adapter.CircleHole;
import com.kata.katawithdom.adapter.CirclePlug;
import com.kata.katawithdom.adapter.SquarePlug;
import com.kata.katawithdom.adapter.SquarePlugAdapterImpl;
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
        SquarePlug squarePlug = new SquarePlug(10);

//        circleHole.fits(squarePlug);
    }

    @Test
    public void givenCircleHole_andAdapterIsUsed_squarePlugFits() {
        CircleHole circleHole = new CircleHole(10);
        SquarePlug squarePlug = new SquarePlug(14.142);
        SquarePlugAdapterImpl adapter = new SquarePlugAdapterImpl(squarePlug);

        Assertions.assertTrue(circleHole.fits(adapter));
    }
}
