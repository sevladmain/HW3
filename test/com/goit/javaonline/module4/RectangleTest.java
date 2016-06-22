package com.goit.javaonline.module4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 22.06.2016.
 */
@RunWith(value = Parameterized.class)
public class RectangleTest {
    private double side1;
    private double side2;
    private double result;

    public RectangleTest(double side1, double side2, double result) {
        this.side1 = side1;
        this.side2 = side2;
        this.result = result;
    }
    @Parameterized.Parameters(name = "{index}: Side1 is {0}, side2 is {1}  Square = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {10, 2, 20},
                {0, 5, 0},
                {25, 4, 100}
        });

    }

    @Test(timeout = 1000)
    public void getSquare() throws Exception {
        Rectangle rectangle = new Rectangle(side1, side2);
        assertEquals(rectangle.GetSquare(), result, 0.0001);
    }

}