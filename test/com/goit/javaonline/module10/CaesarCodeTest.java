package com.goit.javaonline.module10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 08.07.2016.
 */
public class CaesarCodeTest {
    public static CaesarCode code;
    @Before
    public void setUp() throws Exception {
        code = new CaesarCode();
    }

    @Test(timeout = 1000)
    public void encode() throws Exception {
        String inputString = "HelloWorld";
        String outputString = "KMSSwCwFSp";
        assertTrue(outputString.equals(code.Encode(inputString)));
    }

    @Test(timeout = 1000)
    public void decode() throws Exception {
        String inputString = "KMSSwCwFSp";
        String outputString = "HelloWorld";
        assertTrue(outputString.equals(code.Decode(inputString)));

    }

}