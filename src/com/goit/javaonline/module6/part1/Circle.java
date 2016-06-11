package com.goit.javaonline.module6.part1;

/**
 * Created by SeVlad on 04.06.2016.
 */
public class Circle extends Figure {
    private double radius;
    public Circle (){
        radius = 0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double GetSquare() {
        return Math.PI * Math.pow (radius, 2);
    }
}
