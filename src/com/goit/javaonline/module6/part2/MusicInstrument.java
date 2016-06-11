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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicInstrument that = (MusicInstrument) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    public MusicInstrument clone(){
        MusicInstrument musicInstrument = new MusicInstrument(name);
        return musicInstrument;
    }
}
