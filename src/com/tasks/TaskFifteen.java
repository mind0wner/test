package com.tasks;

public class TaskFifteen {
    public static void main(String[] args) {
        String sentence = "uio";
        System.out.println(isStringAllOfVowel(sentence));
    }

    private static boolean isStringAllOfVowel(String sentence) {
//        char[] chars = sentence.toCharArray();
//        for (char c : chars) {
//            if (!(c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
//                    c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
//                    c == 'u' || c == 'U')) {
//                return false;
//            }
//        }
//        return true;
        return sentence.matches("[aeiouAEIOU]");
    }
}