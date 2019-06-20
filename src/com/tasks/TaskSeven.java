package com.tasks;

public class TaskSeven {
    public static void main(String[] args) {
        System.out.println(myConcat("a", "b", "c"));
        System.out.println(myConcat("d", "asdasd", "eqedcdZx"));
        System.out.println(myConcat("d", "1", "1"));
        System.out.println(myConcat("1", "2", "3"));
    }

    private static String myConcat(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}