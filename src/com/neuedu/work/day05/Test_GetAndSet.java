package com.neuedu.work.day05;

import java.util.jar.JarOutputStream;

public class Test_GetAndSet {
    public static void main(String[] args) {
        Person_01 p =new Person_01("tom",12,3000.0);
        p.setAge(20);
        p.setName("jerry");
        System.out.println("p="+p);
    }
}
/*
* 创建实体类：
 *   1、先写出所有的私有属性；
 *   2、通过代码生成器（各种工具软件都自动该功能）生成：
 *     a、无参构造器
 *     b、有参构造器（所有属性作为参数）
 *     c、get/set方法
 *     d、toString方法
 */
class Person_01{
    private String name;
    private int age;
    private double salary;

    public Person_01() {
        super();

    }

    public Person_01(String name, int age, Double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person_01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }
}
