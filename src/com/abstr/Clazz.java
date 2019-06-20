package com.abstr;

import java.util.Objects;

public class Clazz {
    private String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return s.equals(clazz.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

    public Clazz(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
