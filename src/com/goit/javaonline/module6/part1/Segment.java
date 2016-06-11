package com.goit.javaonline.module6.part1;

/**
 * Created by SeVlad on 03.06.2016.
 */
public class Segment {
    private Point point1;
    private Point point2;

    public Segment() {
        point1 = new Point(0, 0);
        point2 = new Point(0, 0);
    }

    public Segment(Point point1, Point point2) {
        if (point1 == null) {
            throw new IllegalArgumentException("Point1 is not set");
        }
        if (point2 == null) {
            throw new IllegalArgumentException("Point2 is not set");
        }
        this.point1 = new Point(point1.getX(), point1.getY());
        this.point2 = new Point(point2.getX(), point2.getY());
    }

    public Point getPoint1() {
        return new Point(point1.getX(), point1.getY());
    }

    public void setPoint1(Point point1) {
        this.point1 = new Point(point1.getX(), point1.getY());
    }

    public Point getPoint2() {
        return new Point(point2.getX(), point2.getY());
    }

    public void setPoint2(Point point2) {
        this.point2 = new Point(point2.getX(), point2.getY());
    }

    public double CalculateLength() {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

}
