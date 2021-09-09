package com.neuedu.work.day0728;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test_泛型接口 {
    public static void main(String[] args) {

    }
}

interface MyInterface<T,U>{
    public void print(T t,U u);
}

class MyClass2 implements MyInterface<String, Date>{
    @Override
    public void print(String t, Date u) {

    }
}

class MyClass3 implements MyInterface<Scanner, Random>{
    @Override
    public void print(Scanner t, Random u) {

    }
}
