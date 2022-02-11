package com.soj.principle.openclosed;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle implements Shape {
    static final Logger logger = LogManager.getLogger(Rectangle.class.getName());
    double result = 0.0;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        result = width * height;
        return result;

    }
}
