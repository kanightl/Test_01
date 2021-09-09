package com.neuedu.work.day04;

public class Test_06_super {
    public static void main(String[] args) {


        Person_06 p =new Student_06();  //向上转型


    }
}


class Person_06{
    String name= "tom";

    Person_06(){
        System.out.println("Person_06()");
    }

    Person_06(String name){
        this();
        System.out.println("Person_06(String name)");
    }

    public void sayHello(){
        System.out.println("hello,Person_06");
    }

}

class Student_06 extends Person_06{
    String name ="jerry";
    int age;

    Student_06(){
        System.out.println("Student_06()");
    }

    Student_06(String name,int age){
        super(name);
        this.age=age;
        System.out.println("Student_06(String name,int age)");
    }

    public void sayHello(){
        System.out.println("hello,Student_06");
    }

    public void haha(){
        sayHello();
        super.sayHello();
    }
}