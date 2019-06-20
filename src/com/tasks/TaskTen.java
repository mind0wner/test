package com.tasks;

import java.util.Random;

public class TaskTen {
    public static void main(String[] args) {
        Random r = new Random();
        r.doubles(10).forEach(System.out::println);
    }
}