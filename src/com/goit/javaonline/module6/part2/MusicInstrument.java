package com.goit.javaonline.module6.part2;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class MusicInstrument {
    protected String name;

    public String getName() {
        return name;
    }

    public MusicInstrument() {
        name = "NONAME";
    }

    @Override
    public String toString() {
        return name;
    }

    public MusicInstrument(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
