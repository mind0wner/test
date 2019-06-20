package com.tasks;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[10];


        System.out.println(Arrays.toString(fillArray(array,5)));
    }
    private  static int[] fillArray(int [] array, int element/*, int amount*/){
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
        }
        return array;
    }
}