package com.goit.javaonline.module5;

import java.util.Scanner;

/**
 * Created by SeVlad on 04.06.2016.
 */
public class ArrayManager {
    public int[] array;

    public ArrayManager(int number) {
        array = new int[number];
    }

    public ArrayManager() {
        array = new int[1];
    }
    public int GetMaxValue(){
        int max = array[0];
        for(int next : array){
            if (next > max){
                max = next;
            }
        }
        return max;
    }
    public int GetMinValue(){
        int min= array[0];
        for(int next : array){
            if (next < min){
                min = next;
            }
        }
        return min;
    }
    public void SetArray(){
        Scanner scanner = new Scanner(System.in);
        for(int index = 0; index < array.length; index++){
            System.out.println("Enter element number " + index);
            array[index] = scanner.nextInt();
        }
    }
    public void PrintArray(){
        for (int index = 0; index < array.length; index++){
            System.out.println("Array[" + index + "] = " + array[index]);
        }
    }
    public void SortArray(boolean isAsc) {
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (isAsc) {
                    if (array[index] > array[index + 1]) {
                        temp = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                        flag = true;
                    }
                } else {
                    if (array[index] < array[index + 1]) {
                        temp = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
    }
}
