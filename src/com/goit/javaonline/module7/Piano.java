package com.goit.javaonline.module7;

import com.goit.javaonline.module6.part2.MusicInstrument;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Piano extends MusicInstrument {
    //Анти шаблон: Boat Anchor
    //Решение: убрать переменную country и методы get / set
    private String country;

    @Override
    public MusicInstrument clone() {
        return new Piano(name);
    }

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
