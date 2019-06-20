package com.tasks;

public class TaskFourteen {
    public static void main(String[] args) {
        String sentence = "Some string";
        String end = " string";
        System.out.println(isOneStringEndsWith(sentence,end));
    }
    private static boolean isOneStringEndsWith(String sentence, String end){
        return sentence.endsWith(end);
    }
}