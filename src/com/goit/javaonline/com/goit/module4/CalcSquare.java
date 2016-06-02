package com.goit.javaonline.com.goit.module4;

/**
 * Created by SeVlad on 02.06.2016.
 */
public class CalcSquare {
    public double TriangleSquare(double height, double side){
        return height * side / 2;
    }
    public double RectangleSquare(double side1, double side2){
        return side1 * side2;
    }
    public double CircleSquare(double radius){
        return Math.PI * Math.pow (radius, 2);
    }

}
