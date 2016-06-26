package com.goit.javaonline.module5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 26.06.2016.
 */
public class ArrayManagerTest {
    public static ArrayManager arrayManager;
    @Before
    public void setUp() throws Exception {
        arrayManager = new ArrayManager();
        arrayManager.array = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayManager.array[i] = (i + 1) % 4;
        }
    }

    @Test(timeout = 1000)
    public void getMaxValue() throws Exception {
        assertEquals(arrayManager.GetMaxValue(), 3);
    }

    @Test(timeout = 1000)
    public void getMinValue() throws Exception {
        assertEquals(arrayManager.GetMinValue(), 0);
    }

    @Test(timeout = 1000)
    public void sortArray() throws Exception {
        arrayManager.SortArray(false);
        assertEquals(arrayManager.array[0],3);
        assertEquals(arrayManager.array[1],2);
        assertEquals(arrayManager.array[2],1);
        assertEquals(arrayManager.array[3],1);
        assertEquals(arrayManager.array[4],0);

    }

}