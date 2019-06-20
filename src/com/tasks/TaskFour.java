package com.tasks;

import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        int[] array = {13,2,34,23,1,5,4,2};
        System.out.println(findMinValue(array));
    }

    private static int findMinValue(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}