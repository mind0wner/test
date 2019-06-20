package com.abstr;

public class AbstractClass implements SomeInterface{
    int classMethod(){
     return 1;
    }

    @Override
    public int firstMethod() {
		int i = 3;
		int q = 3;

        return 1;
    }

    @Override
    public int secondMethod() {
        return 0;
    }

    public AbstractClass() throws Throwable {
        throw new Throwable("Constructor exception");
    }

    public static void main(String[] args) {
        try{
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //throw new Exception();
        }
    }
}
