package com.neuedu.work.day0728;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test_TreeSet {
    public static void main(String[] args) {
        Set set=new TreeSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("12");
        set.add("8");

        System.out.println(set);

        set=new TreeSet(new Student_73_Sort());
        set.add(new Student_73("tom",20));
        set.add(new Student_73("jerry",22));
        set.add(new Student_73("jack",30));
        System.out.println(set);
    }
}

//实现比较算法的类，用来比较两个对象的大小
class Student_73_Sort implements Comparator<Student_73> {
    @Override
    public int compare(Student_73 o1,Student_73 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Student_73{
    String name;
    int age;
    public Student_73(){}

    public Student_73(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_73{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
