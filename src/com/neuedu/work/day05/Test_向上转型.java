package com.neuedu.work.day05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test_向上转型 {
    public static void main(String[] args) {
        Person_37 p=new Student_37();
//        p.study();//不能调用子类自己的方法
        p.sayHello();//可以调用父类中声明的方法，这里发生了方法覆盖

        //向下转换，必须曾经上溯，才能下溯转回子类型
        Person_37 p2 =new Person_37();
//        Student_37 s2 =(Student_37)p2;
        Student_37 s=(Student_37)p;
        s.study();

        //instanceof 运算符
        if (s instanceof Person_37){
            System.out.println("s 是Person_37类型的");
        }
        if (s instanceof Student_37){
            System.out.println("s 是Student_37类型的");
        }
        if (p instanceof Person_37){
            System.out.println("p 是Person_37类型的");
        }
        if (p instanceof Student_37){
            System.out.println("p 是Student_37类型的");
        }
    };
}

class Person_37{
    public void sayHello(){
        System.out.println("Hello！");
    }
}

class Student_37 extends Person_37{
    public void sayHello(){
        System.out.println("Hello");
    }
    public void study(){
        System.out.println("I can study");
    }

}