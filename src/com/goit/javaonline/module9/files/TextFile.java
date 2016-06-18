package com.goit.javaonline.module9.files;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class TextFile extends File {
    private String encoding;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    public TextFile(String fileName, int fileSize, String encoding) {
        super(fileName, fileSize);
        this.encoding = encoding;
    }
}
