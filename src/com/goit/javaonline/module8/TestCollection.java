package com.goit.javaonline.module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SeVlad on 12.06.2016.
 */
public class TestCollection {
    public static void PrintFileCollection(List<File> fileList) {
        System.out.println("Filename\tFileSize");
        for (File f :
                fileList) {
            System.out.println(f.getFileName() + "\t" + f.getFileSize());
        }
    }

    public static void PrintTextFileCollection(List<TextFile> textFiles) {
        System.out.println("Filename\t\tFileSize\tEncoding");
        for (TextFile f :
                textFiles) {
            System.out.println(f.getFileName() + "\t\t"
                    + f.getFileSize() + "\t\t"
                    + f.getEncoding());
        }
    }

    public static void PrintAudioFileCollection(List<AudioFile> audioFiles) {
        System.out.println("Filename\t\tFileSize\tBitRate");
        for (AudioFile f :
                audioFiles) {
            System.out.println(f.getFileName() + "\t\t"
                    + f.getFileSize() + "\t\t"
                    + f.getBitRate());
        }
    }

    public static void PrintImageFileCollection(List<ImageFile> imageFiles) {
        System.out.println("Filename\t\tFileSize\tResolution");
        for (ImageFile f :
                imageFiles) {
            System.out.println(f.getFileName() + "\t\t"
                    + f.getFileSize() + "\t\t"
                    + f.getResolution());
        }
    }

    public static void SortFiles(List<File> files) {
        File file;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int index = 0; index < files.size() - 1; index++) {
                if (files.get(index).getFileSize() > files.get(index + 1).getFileSize()) {
                    file = files.get(index).clone();
                    files.add(index, files.get(index + 1).clone());
                    files.add(index + 1, file);
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        List<AudioFile> audioFiles = new ArrayList<>();
        List<ImageFile> imageFiles = new ArrayList<>();
        List<TextFile> textFiles = new ArrayList<>();

        //Demo data initialization
        for (int index = 0; index < 3; index++) {
            audioFiles.add(new AudioFile("audioFile" + (index + 1) + ".mp3", index * 100 + 50, 66000));
            imageFiles.add(new ImageFile("imageFile" + (index + 1) + ".jpg", index * 50 - 10, 800));
            textFiles.add(new TextFile("textFile" + (index + 1) + ".txt", index * 50 + 5, "UTF8"));
            files.add(audioFiles.get(index));
            files.add(imageFiles.get(index));
            files.add(textFiles.get(index));
        }

        //Print Files
        PrintTextFileCollection(textFiles);
        PrintAudioFileCollection(audioFiles);
        PrintImageFileCollection(imageFiles);
        PrintFileCollection(files);

        SortFiles(files);
        System.out.println("After sorting:");
        PrintFileCollection(files);
    }
}
