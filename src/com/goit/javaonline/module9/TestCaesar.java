package com.goit.javaonline.module9;

import com.goit.javaonline.module9.files.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SeVlad on 18.06.2016.
 */
public class TestCaesar {
    public static void main(String[] args) {

        CaesarCode caesarCode = new CaesarCode();
        caesarCode.PrintCodeTable();
        List<File> fileList = new ArrayList<>();
        fileList.add(new ImageFile("Image.jpg", 100, 300));
        fileList.add(new TextFile("Text.txt", 100, "UTF8"));
        fileList.add(new AudioFile("Audio.mpg", 100, 300));
        String testString = fileList.toString().replace("[","")
                .replace("]","")
                .replace(" ","")
                .replace(",","")
                .replace(".","")
                .trim();
        String resultString = caesarCode.Encode(testString);
        System.out.println("Original String: " + testString);
        System.out.println("Encoded String: " + resultString);
        System.out.println("Decoded Encoded String: " + caesarCode.Decode(resultString));
    }
}
