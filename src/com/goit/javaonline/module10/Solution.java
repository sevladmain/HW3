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
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        CaesarStreamReader code = new CaesarStreamReader();
        String pass = scanner.nextLine();
        try {
            code.Write(pass);
        } catch (IOException e){
            System.out.println("IO EXCEPTION: " + e.getMessage());
        }
        try {
            code.Read(pass);
        } catch (IOException e) {
            System.out.println("IO EXCEPTION: " + e.getMessage());
        }
    }
}
