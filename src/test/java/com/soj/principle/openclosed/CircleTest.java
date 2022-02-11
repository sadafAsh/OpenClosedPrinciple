package com.soj.principle.openclosed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToGetAreaOfCircle() {
        Circle circle=new Circle(2);
        Assertions.assertEquals(12.566370614359172,circle.area());
    }
}