package com.goit.javaonline.module001;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 10.07.2016.
 */
public class MyArrayListTest {
    public static MyArrayList<Integer> myArray;
    public static Integer[] expectedArray;
    @BeforeClass
    public static void setUp() throws Exception {
        myArray = new MyArrayList<>(5);
        expectedArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        assertEquals(myArray.size(), 0);
    }


    @Test
    public void add() throws Exception {
        myArray = new MyArrayList<>(5);
        for (Integer el :
                expectedArray) {
            myArray.add(el);
        }
        assertArrayEquals(myArray.getArray(), expectedArray);

    }
    @Test
    public void addIndex() throws Exception {
        myArray = new MyArrayList<>(5);
        for (int i = 0; i < expectedArray.length; i++) {
            myArray.add(expectedArray[i], i);
        }
        assertArrayEquals(myArray.getArray(), expectedArray);
    }

    @Test
    public void get() throws Exception {
        myArray = new MyArrayList<>(5);
        for (int i = 0; i < expectedArray.length; i++) {
            myArray.add(expectedArray[i], i);
        }
        assertEquals(myArray.get(5), expectedArray[5]);

    }

    @Test
    public void size() throws Exception {
        myArray = new MyArrayList<>(5);
        for (int i = 0; i < expectedArray.length; i++) {
            myArray.add(expectedArray[i], i);
        }
        assertEquals(myArray.size(), expectedArray.length);
    }

    @Test
    public void isEmpty() throws Exception {
        myArray = new MyArrayList<Integer>();
        assertEquals(myArray.isEmpty(), true);

    }

}