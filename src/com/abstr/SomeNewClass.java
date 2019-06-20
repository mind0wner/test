package com.abstr;

public class SomeNewClass {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public boolean isEqualToI(int n) {
        return n == i;
    }

    public void setN(int n) {
        n = i;

    }
}