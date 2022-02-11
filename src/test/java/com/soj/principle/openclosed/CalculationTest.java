package com.soj.principle.openclosed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void testToCalculateTheAreas() {
        Calculation calculation=new Calculation();
        Shape square=new Square(3);
        calculation.calculate(square);
        Assertions.assertEquals(square,calculation.calculate(square));

    }


}
