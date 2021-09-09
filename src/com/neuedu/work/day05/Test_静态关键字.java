package com.neuedu.work.day05;

public class Test_静态关键字 {
    public static void main(String[] args) {
        System.out.println("Person_40.country= "+Person_40.country);
        Person_40.sayHello();

        Person_40 p = new Person_40();
        Person_40 p2 =new Person_40();
    }

}

class Person_40{
    String name;
    static String country="中国";
    {
        System.out.println("--普通代码块");
    }
    static {//优先执行
        System.out.println("--静态代码块");
    }

    public static void sayHello(){
        System.out.println("hello");
    }
}
class Student_40 extends Person_40{
    //	@Override
    //静态方法不能覆盖，这里这么写不是覆盖语法
    public static void sayHello() {
        System.out.println("hello222");
    }
}
