package com.goit.javaonline.module10;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by SeVlad on 26.06.2016.
 */
public class CaesarStreamReaderTest {
    public static CaesarStreamReader code;

    @Before
    public void setUp() throws Exception {
        code = new CaesarStreamReader();
        code.fName = "example.txt";
    }

    @Test(timeout = 1000)
    public void write() throws Exception {
        String inputString = "HelloWorld";
        String outputString = "KMSSwCwFSp";
        code.Write(inputString);
        FileReader reader = null;
        reader = new FileReader(code.fName);
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }

        assertTrue(outputString.equals(builder.toString()));
    }


}