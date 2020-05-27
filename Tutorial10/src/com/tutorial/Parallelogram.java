package com.tutorial;

public class Parallelogram implements Figure {

    double baseSide;
    double side;
    double height;

    public Parallelogram (double baseSide, double side, double height){
        this.baseSide = baseSide;
        this.height = height;
        this.side = side;
    }

    @Override
    public double getPerimeter() {

        return (baseSide + side)* 2;
    }

    @Override
    public double getArea() {
        return baseSide*height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}
