package com.goit.javaonline.module4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 22.06.2016.
 */
public class SegmentTest {
    @Test(timeout = 1000)
    public void calculateLength() throws Exception {
        Segment segment = new Segment(new Point(0,0), new Point(3,4));
        assertEquals(segment.CalculateLength(), 5, 0.0001);
    }

}