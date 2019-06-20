package com.tasks;

public class TaskEleven {
    public static void main(String[] args) {
//        Random r = new Random();
//        IntStream.range(10,12).limit(10).forEach(System.out::println);
//        Stream.of(r.ints(10,9,13)).forEach(System.out::println);
        int min = 10;
        int max = 12;
        for (int i = 0; i <= 10; i++) {
            System.out.println((int)(Math.random() * ((max - min) + 1)) + min);
        }
    }
}