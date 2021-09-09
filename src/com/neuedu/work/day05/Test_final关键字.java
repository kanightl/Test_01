package com.neuedu.work.day05;

public class Test_final关键字 {
    final static   int i=5;



    public static void main(String[] args) {
        final int j =6;
        //属性不能被修改
//        i=8;
        //局部变量不能被修改

    }
}

final class  MyFinalClass{}
//1、final的类不能被继承
//class MySonClass extends MyFinalClass{}
class Person_42{
    public final void sayHello(){}
}
class Student_42 extends Person_42{
    //2、final的方法不能被覆盖
//	public void sayHello() {}
}