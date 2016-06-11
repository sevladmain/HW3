package com.goit.javaonline.module6.part2;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Piano extends MusicInstrument {
    private String country;

    public Piano(String name) {
        super(name);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
