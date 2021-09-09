package com.neuedu.work.day04;

public class Test_03_类 {
    public static void main(String[] args) {
        Person_03 p =new Person_03();
        p.name="tom";
        p.age=20;
        p.gender="male";

        Person_03 q =new Person_03();
        q.name="jerry";
        q.age=21;
        q.gender="female";
        p.sayHello();
        q.sayHello();


        System.out.println("--------------------");

        Person_03 j=new Person_03("jack",22,"male");
        Person_03 k=new Person_03("rose",18,"female");
        j.sayHello();
        k.sayHello();

    }
}

class Person_03{
    String name;
    int age;
    String gender;


    public Person_03(){}

    public Person_03(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void sayHello(){
        System.out.println("hello,I am "+name);
    }
}
