package com.neuedu.work.day0726;

public class Test_继承与实现 {
    public static void main(String[] args) {
       Student_45 p =new Student_45("zh",21,"男","jkd");
       p.getInfo();
       p.sayHello();
       p.study();
       p.userCredit();
    }
}

class Person_45{
   private String name;
   private int age;
   private String sex;

    public Person_45() {
    }

    public Person_45(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void getInfo(){
        System.out.println("姓名"+name+"年龄"+age+"性别"+sex);
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}

interface Consumer{
    void userCredit();
}

class Student_45 extends Person_45 implements Consumer{
    private String school;

    public Student_45(){}

    public Student_45(String name, int age, String sex, String school) {
        super(name, age, sex);
        this.school = school;
    }

    public void study(){
        System.out.println("我在"+school+"学习");
    }

    @Override
    public void userCredit() {
        System.out.println("我可以使用信用卡");
    }


}