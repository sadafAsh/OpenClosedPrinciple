package com.soj.principle.openclosed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testToGetAreaOfSquare() {
        Square square=new Square(2);
        Assertions.assertEquals(4,square.area());
    }
}