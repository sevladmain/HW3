package com.goit.javaonline.module9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 26.06.2016.
 */
public class CaesarCodeTest {
    public static CaesarCode code;
    @Before
    public void setUp() throws Exception {
        code = new CaesarCode();
    }

    @Test(timeout = 1000)
    public void encode() throws Exception {
        String pass = "HelloWorld";
        assertTrue(!pass.equals(code.Encode(pass)));
    }

    @Test(timeout = 1000)
    public void decode() throws Exception {
        String pass = "HelloWorld";
        assertTrue(pass.equals(code.Decode(code.Encode(pass))));

    }

}