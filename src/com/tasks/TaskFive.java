package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFive {
    public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
          list.add(i);
        }
        System.out.println(streamSum(list));
        System.out.println(formulaSum(list));
    }
    private static int streamSum(List<Integer> sequence){
        return  sequence.stream().mapToInt(Integer::intValue).sum();
    }

    private static int formulaSum(List<Integer> sequence){
        return (sequence.get(0)+sequence.get(sequence.size()-1))*sequence.size()/2;
    }
}