package com.goit.javaonline.module001;

import java.util.Arrays;

/**
 * Created by SeVlad on 10.07.2016.
 */
public class MyArrayList<T> {
    private Object[] array;
    private int maxCapacity;
    private int currentLength;


    public MyArrayList() {
        maxCapacity = 10;
        currentLength = 0;
        array = new Object[10];
    }
    public MyArrayList(int length) {
        if(length < 0 || length == Integer.MAX_VALUE){
            throw (new IllegalArgumentException("Array length should be non negative"));
        }
        maxCapacity = (length < 10) ? 10: length;
        currentLength = 0;
        array = new Object[maxCapacity];
    }
    public int add(T element){
        if(maxCapacity == Integer.MAX_VALUE){
            return -1;
        }
        if(currentLength == maxCapacity){
            maxCapacity *= 2;
            array = Arrays.copyOf(array, maxCapacity);
        }
        array[currentLength++] = element;
        return currentLength;
    }
    public int add(T element, int index){
        if (index < 0){
            throw new IllegalArgumentException("Array index should be nnn negative");
        }
        if (index >= currentLength){
            return add(element);
        } else {
            array[index] = element;
        }
        return index;
    }
    public T get(int index){
        if (index < 0 || index > currentLength - 1){
            throw new IllegalArgumentException("Invalid array index");
        }
        return (T)array[index];
    }
    public int size(){
        return currentLength;
    }
    public boolean isEmpty(){
        return currentLength == 0;
    }
    public T[] getArray(){
        return (T[])Arrays.copyOf(array, currentLength);
    }
}
