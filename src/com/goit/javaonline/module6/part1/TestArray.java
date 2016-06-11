package com.goit.javaonline.module6.part1;

import java.util.Scanner;

/**
 * Created by SeVlad on 04.06.2016.
 */
public class TestArray {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        number = scanner.nextInt();
        ArrayManager arrayManager = new ArrayManager(number);
        System.out.println("Enter elements of Array, please.");
        arrayManager.SetArray();
        System.out.println("Minimum value is: " + arrayManager.GetMinValue());
        System.out.println("Maximum value is: " + arrayManager.GetMaxValue());
        arrayManager.SortArray(true);
        System.out.println("Array is ordered by ascending");
        arrayManager.PrintArray();
        arrayManager.SortArray(false);
        System.out.println("Array is ordered by descending");
        arrayManager.PrintArray();
    }
}
