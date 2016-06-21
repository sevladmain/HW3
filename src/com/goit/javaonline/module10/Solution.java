package com.goit.javaonline.module10;

import com.goit.javaonline.module9.CaesarCode;

import java.io.*;
import java.util.Scanner;

/**
 * Created by SeVlad on 21.06.2016.
 * Реализовать сохранение/загрузку текстового сообщения в файл с предварительным шифрованием/расшифрованием.
 * Предусмотреть обработку различных ошибок ввода/вывода.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        CaesarCode code = new CaesarCode();
        String pass = scanner.nextLine();
        FileReader reader = null;
        FileWriter writer = null;
        try {
            writer = new FileWriter("example.txt");
            writer.write(code.Encode(pass));

        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO EXCEPTION: " + e.getMessage());
        } finally {
            if (writer != null)
                writer.close();
        }
        System.out.println("File saved");
        try {
            reader = new FileReader("example.txt");
            StringBuilder builder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char)c);
            }
            System.out.println("Encode: " + builder);
            System.out.println("Decode: " + code.Decode(builder.toString()));
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO EXCEPTION: " + e.getMessage());
        } finally {
            if (reader != null)
                reader.close();
        }

    }

}
