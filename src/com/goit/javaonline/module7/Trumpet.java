package com.goit.javaonline.module7;

import com.goit.javaonline.module6.part2.MusicInstrument;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Trumpet extends MusicInstrument {
    //Анти шаблон: Boat Anchor
    //Решение: убрать переменную length и методы get / set

    private int length;

    public Trumpet(String name) {
        super(name);
    }

    @Override
    public MusicInstrument clone() {
        return new Trumpet(name);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
