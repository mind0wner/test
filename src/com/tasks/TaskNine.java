package com.tasks;

import java.util.Random;

public class TaskNine {
    public static void main(String[] args) {
        Random r = new Random();
        r.ints(10).forEach(System.out::println);
    }
}