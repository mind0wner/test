package com.tasks;

import java.util.ArrayList;
import java.util.List;


public class TaskThirteen {
    public static void main(String[] args) {
        String sentence = "ABCabc";
        System.out.println(asciiLettersSum(sentence));
    }

    private static int asciiLettersSum(String sentence){
//        char[] chars = sentence.toCharArray();
//        List<Integer> list= new ArrayList<>();
//        for (char c: chars) {
//            if((c>=65&&c<=90)||(c>=97&&c<=122)){
//               list.add(((int) c));
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).sum();
        return sentence.chars().filter(Character::isLetter).sum();
    }
}