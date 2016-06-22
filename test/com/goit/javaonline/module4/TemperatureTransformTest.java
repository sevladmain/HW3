package com.goit.javaonline.module4;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 22.06.2016.
 */
public class TemperatureTransformTest {
    public static TemperatureTransform temp;
    public static double delta;
    private final double degree = 100;

    @BeforeClass
    public static void setUp() throws Exception {
        TemperatureTransformTest.temp = new TemperatureTransform();
        delta = 0.0001;
        assertEquals("Testing initial Cel data", temp.getCelTemp(), 0, delta);
        assertEquals("Testing initial data", temp.getFarTemp(), 32, delta);
    }

    @Test(timeout = 1000)
    public void celsium2Farenh() throws Exception {
        assertEquals("Converting Celsium 2 Farenheit", temp.Celsium2Farenh(degree), degree * 9 /5 + 32, delta);
    }

    @Test(timeout = 1000)
    public void farenh2Celsium() throws Exception {

        assertEquals("Converting Farenheit 2 Celsium ", temp.Farenh2Celsium(degree), (degree - 32 )* 5 / 9, delta);

    }


    @Test(timeout = 1000)
    public void setCelTemp() throws Exception {
        temp.setCelTemp(degree);
        assertEquals("Setting Cels temp and recovering Far temp", temp.getFarTemp(), degree * 9 /5 + 32, delta);
    }


    @Test(timeout = 1000)
    public void setFarTemp() throws Exception {
        temp.setFarTemp(degree);
        assertEquals("Setting Far temp and recovering Cel temp", temp.getCelTemp(), (degree - 32 )* 5 / 9, delta);

    }

}