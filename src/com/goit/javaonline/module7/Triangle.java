package com.goit.javaonline.module7;

import com.goit.javaonline.module6.part1.Figure;

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

    public void CheckStates(){
        if (height <= 0 || side <= 0){
            // Анти-шаблон: Magic number
            // Решение: виделить повторяющуюся строку  "Temperature is not valid" в отдельный enum
            throw new IllegalStateException("Height or side of Triangle is not valid");
        }
    }
    @Override
    public double GetSquare() {
        CheckStates();
        return height * side / 2;
    }
}
