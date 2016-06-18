package com.goit.javaonline.module9.files;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class AudioFile extends File {
    private int bitRate;

    public AudioFile(String fileName, int fileSize, int bitRate) {
        super(fileName, fileSize);
        this.bitRate = bitRate;
    }


    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }
}
