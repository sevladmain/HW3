package com.goit.javaonline.module7;

import com.goit.javaonline.module6.part2.MusicInstrument;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Guitar extends MusicInstrument {
    //Анти шаблон: Boat Anchor
    //Решение: убрать переменную numStrings и методы get / set
    private int numStrings;

    public Guitar(String name) {
        super(name);
    }

    @Override
    public MusicInstrument clone() {
        return new Guitar(name);
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
