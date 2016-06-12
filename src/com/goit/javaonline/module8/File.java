package com.goit.javaonline.module8;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class File {
    protected String fileName;
    protected int fileSize;

    public File() {
        fileName = "";
        fileSize = 0;
    }

    public File(String fileName, int fileSize) {

        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }

    public File clone() {
        return new File(fileName, fileSize);
    }
}
