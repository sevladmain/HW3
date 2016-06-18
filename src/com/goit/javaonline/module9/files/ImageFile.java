package com.goit.javaonline.module9.files;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class ImageFile extends File {
    private int resolution;

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    public ImageFile(String fileName, int fileSize, int resolution) {
        super(fileName, fileSize);
        this.resolution = resolution;
    }

}
