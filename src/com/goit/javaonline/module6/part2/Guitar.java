package com.goit.javaonline.module6.part2;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Guitar extends MusicInstrument {
    private int numStrings;

    public Guitar(String name) {
        super(name);
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
