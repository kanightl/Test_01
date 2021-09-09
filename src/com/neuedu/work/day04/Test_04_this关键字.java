package com.neuedu.work.day04;

public class Test_04_this关键字 {

     /*
     * this关键字的两种使用：
     *   1、this.属性或者this.方法()，表示调用对象自己的属性或者方法；
     *   2、this()，表示调用自己的构造器，可以根据参数自动匹配；
     *
     */


    public static void main(String[] args) {
        Person_04 p =new Person_04("tom",20,"male");
        p.eat();
    }

}

class Person_04{
    String name;
    int age;
    String gender;

    public Person_04(){
        System.out.println("Person_04()");
    }


    public Person_04(String name){
        this.name= name;
        System.out.println("Person_04(String name)");
    }

    public Person_04(String name, int age, String gender) {
        this(name);//调用自己的一个参数的构造器
        this.age = age;
        this.gender = gender;
        System.out.println("Person_04(3个字符)");
    }

    public void sayHello(){
        System.out.println("hello,I am "+this.name);
    }

    public void eat(){
        this.sayHello();//调用自己的普通方法
        System.out.println("eat");
    }

}
