package com.goit.javaonline.module6.part2;

/**
 * Created by SeVlad on 11.06.2016.
 */
public class WrongInstrumentException extends Exception{
    public WrongInstrumentException(String message) {
        super(message);
        System.out.println("Invalid instrument: " + message);
    }
}
