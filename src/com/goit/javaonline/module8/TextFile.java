package com.goit.javaonline.module8;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class TextFile extends File {
    private String encoding;

    public TextFile(String fileName, int fileSize, String encoding) {
        super(fileName, fileSize);
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public File clone()  {
        return new TextFile(fileName, fileSize, encoding);
    }
}
