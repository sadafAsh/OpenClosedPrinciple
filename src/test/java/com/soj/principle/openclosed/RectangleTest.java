package com.soj.principle.openclosed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToGetAreaOfRectangle() {
        Rectangle rectangle=new Rectangle(2,5);
        Assertions.assertEquals(10,rectangle.area());
    }
}