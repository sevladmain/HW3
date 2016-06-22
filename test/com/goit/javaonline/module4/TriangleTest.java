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
public class TriangleTest {
    private double side;
    private double height;
    private double result;

    public TriangleTest(double side, double height, double result) {
        this.side = side;
        this.height = height;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}: Side is {0}, height is {1}  Triangle Square = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {10, 2, 10},
                {0, 5, 0},
                {25, 4, 50}
        });

    }

    @Test(timeout = 1000)
    public void getSquare() throws Exception {
        Triangle triangle = new Triangle(side, height);
        assertEquals(triangle.GetSquare(), result, 0.001);
    }

}