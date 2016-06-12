package com.goit.javaonline.module7;

import com.goit.javaonline.module6.part1.*;
import com.goit.javaonline.module6.part1.TemperatureTransform;

import java.util.Scanner;

/**
 * Created by SeVlad on 04.06.2016.
 */
public class Test {
    public static void main(String[] args) {
        //Testing Squares
        Scanner scanner = new Scanner(System.in);
        double h, s;
        System.out.println("Enter heigh of Trianle:");
        h = scanner.nextDouble();
        System.out.println("Enter side of Trianle:");
        s = scanner.nextDouble();
        Figure figure = new Triangle(h, s);
        try {
            System.out.println("Square of figure is " + figure.GetSquare());
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        // Антишаблон: Hard Code
        // Решение: переменные должны вводиться с клавиатуры, а не быть захардкожены в тексте
        double s1 = 5, s2 = 6;
        System.out.println("Rectangle s1=" + s1 + ", s2=" + s2);
        figure = new Rectangle(s1, s2);
        System.out.println("Square of figure is " + figure.GetSquare());
        double r = 5;
        System.out.println("Circle r=" + r);
        figure = new Circle(r);
        System.out.println("Square of figure is " + figure.GetSquare());

        // testing TemperatureTramsform
        com.goit.javaonline.module6.part1.TemperatureTransform t = new TemperatureTransform();
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        // Антишаблон: Hard Code
        // Решение: переменные должны вводиться с клавиатуры, а не быть захардкожены в тексте
        double c = 5, f = 4;
        t.setCelTemp(c);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        t.setFarTemp(f);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());

        //testing Length
        // Антишаблон: Hard Code
        // Решение: переменные должны вводиться с клавиатуры, а не быть захардкожены в тексте
        double x1 = 3, y1 = 0, x2 = 0, y2 = 4;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Segment segment = new Segment(point1, point2);
        System.out.println("Length between points (" + segment.getPoint1().getX() + ", " + segment.getPoint1().getY()
                + ") and (" + segment.getPoint2().getX() + ", " + segment.getPoint2().getY() + ") is " + segment.CalculateLength());


        int number;
        System.out.println("Enter number of elements:");
        number = scanner.nextInt();
        ArrayManager arrayManager = new ArrayManager(number);
        System.out.println("Enter elements of Array, please.");
        try {
            arrayManager.SetArray();
        } catch (Exception e) {
            System.out.println("Hold on there and good luck!");
            throw e;
        }
    }
}
