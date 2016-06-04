package com.goit.javaonline.module4;

/**
 * Created by SeVlad on 04.06.2016.
 */
public class Triangle extends Figure {
    private double height;
    private double side;

    public Triangle() {
        height = 0;
        side = 0;
    }

    public Triangle(double height, double side) {

        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double GetSquare() {
        return height * side / 2;
    }
}
