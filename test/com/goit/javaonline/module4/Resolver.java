package com.goit.javaonline.module4;

import com.goit.javaonline.module4.*;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Resolver {
    public static void main(String[] args) {
        //Testing Squares
        double h = 10, s = 5;
        System.out.println("Triangle h=" + h + ", s=" + s );
        Figure figure = new Triangle(h,s);
        System.out.println("Square of figure is " + figure.GetSquare());
        double s1 = 5, s2 = 6;
        System.out.println("Rectangle s1=" + s1 + ", s2=" + s2 );
        figure = new Rectangle(s1,s2);
        System.out.println("Square of figure is " + figure.GetSquare());
        double r = 5;
        System.out.println("Circle r=" + r );
        figure = new Circle(r);
        System.out.println("Square of figure is " + figure.GetSquare());

        // testing TemperatureTramsform
        TemperatureTransform t = new TemperatureTransform();
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        double c = 5, f = 4;
        t.setCelTemp(c);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        t.setFarTemp(f);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());

        //testing Length

        double x1 = 3, y1 = 0, x2 = 0, y2 = 4;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Segment segment = new Segment(point1, point2);
        System.out.println("Length between points (" + segment.getPoint1().getX() + ", " + segment.getPoint1().getY()
                + ") and (" + segment.getPoint2().getX() + ", " + segment.getPoint2().getY() + ") is " + segment.CalculateLength());
    }
}
