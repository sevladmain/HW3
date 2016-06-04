package com.goit.javaonline.module4;

/**
 * Created by SeVlad on 02.06.2016.
 */
public class CalcSquare {
    public double TriangleSquare(double height, double side){
        Triangle triangle = new Triangle(height, side);
        return triangle.GetSquare();
    }
    public double RectangleSquare(double side1, double side2){
        Rectangle rectangle = new Rectangle(side1, side2);
        return rectangle.GetSquare();
    }
    public double CircleSquare(double radius){
        Circle circle = new Circle(radius);
        return circle.GetSquare();
    }

}
