package com.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

public class TaskOne {
    public static void main(String[] args) {

        int[] unsortedArray = {13,2,34,23,1,5,4,2};
        System.out.println(Arrays.toString(sortArray(unsortedArray)));
        List<Integer> unsortedList = new ArrayList<>();
        for (int element : unsortedArray) {
            unsortedList.add(element);
        }

        List<Integer> sortCollection = sortCollection(unsortedList);
        System.out.println(sortCollection.toString());
    }
    private static int[] sortArray(int [] array){
        sort(array);
        return array;
    }
    private static List<Integer> sortCollection(List<Integer> list){
        return list.stream().sorted().collect(Collectors.toList());
    }
}