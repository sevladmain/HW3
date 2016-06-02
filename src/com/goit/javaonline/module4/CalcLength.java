package com.goit.javaonline.module4;

/**
 * Created by SeVlad on 03.06.2016.
 */
public class CalcLength {
    public double CalculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}
