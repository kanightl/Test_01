package com.neuedu.work.day0728;

public class Test_泛型类 {
    public static void main(String[] args) {
        MyClass<String> a=new MyClass<>("tom","jerry");
        System.out.println(a);

        MyClass<Integer> b=new MyClass<>(12,51);
        System.out.println(b);
    }
}

class MyClass<T>{
    T t1;
    T t2;
    public MyClass(){}

    public MyClass(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}
