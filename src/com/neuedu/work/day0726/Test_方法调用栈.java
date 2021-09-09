package com.neuedu.work.day0726;

public class Test_方法调用栈 {
    public static void main(String[] args) {
        one();
        System.out.println("main");
    }

    public static void one() {
        two();
        System.out.println("one");
    }

    public static void two() {
        three();
        System.out.println("two");
    }

    public static void three() {
        try {
            int i = 1 / 0;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("three");
    }
}
