package com.tasks;

public class TaskSix {
    public static void main(String[] args) {
String str = "Contains";
String sub = "nta";
String subTest = "ant";
        System.out.println(isContainsSubstring(str,sub));
        System.out.println(isContainsSubstringByIndexOf(str,sub));
        System.out.println(isContainsSubstringByIndexOf(str,subTest));

    }
    private static boolean isContainsSubstring(String sentence, String substring){
        return sentence.contains(substring);
    }
    private static boolean isContainsSubstringByIndexOf(String sentence, String substring){
        return sentence.indexOf(substring)>0;
    }

}