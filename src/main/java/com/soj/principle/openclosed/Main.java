package com.soj.principle.openclosed;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Rectangle rectangle = new Rectangle(2, 6);
        calculation.calculate(rectangle);
        logger.debug("The area of rectangle is {}", rectangle.result);

        Circle circle = new Circle(4);
        calculation.calculate(circle);
        logger.debug("The area of circle is {}", circle.result);

        Square square=new Square(5);
        calculation.calculate(square);
        logger.debug("The area of square is {}", square.result);
    }
}
