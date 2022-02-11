package com.soj.principle.openclosed;

public class Square implements Shape {
    private  double side;
    double result;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        result=side*side;
        return result;
    }
}
