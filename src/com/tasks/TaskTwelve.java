package com.tasks;

import java.util.Arrays;
import java.util.List;

public class TaskTwelve {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,1,32,4,23,2);
        List<Integer> beginning = Arrays.asList(5,1,32,6);
        System.out.println(isListStartsWith(list,beginning));
    }

    private static boolean isListStartsWith(List<Integer> list, List<Integer> beginning) {
        return list.subList(0,beginning.size()).containsAll(beginning);
    }
}