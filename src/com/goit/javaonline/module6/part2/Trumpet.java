package com.goit.javaonline.module6.part2;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Trumpet extends MusicInstrument {
    private int length;

    public Trumpet(String name) {
        super(name);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
