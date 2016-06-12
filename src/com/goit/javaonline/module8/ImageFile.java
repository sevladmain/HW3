package com.goit.javaonline.module8;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class ImageFile extends File {
    private int resolution;

    public ImageFile(String fileName, int fileSize, int resolution) {
        super(fileName, fileSize);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public File clone() {
        return new ImageFile(fileName, fileSize, resolution);
    }
}
