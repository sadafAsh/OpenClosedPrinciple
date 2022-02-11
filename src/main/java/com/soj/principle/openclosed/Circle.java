package com.soj.principle.openclosed;

public class Circle implements Shape {
    double result;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        result = radius * radius * Math.PI;
        return result;
    }
}
