package com.neuedu.work.day05;

public class Test_多态 {
    public static void main(String[] args) {
        //赋值多态
        Animal_38 a=new Cat_38();
        Animal_38 b=new Dog_38();
        a.sayHello();
        b.sayHello();
        System.out.println("--------------");
//        传参多态
        haha(a);
        haha(b);
    }
    public static void haha(Animal_38 a){
        a.sayHello();
    }
}

interface Animal_38{
    public void sayHello();
}


class Cat_38 implements Animal_38{
    @Override
    public void sayHello(){
        System.out.println("喵喵喵");
    }


}

class Dog_38 implements Animal_38{
    @Override
    public void sayHello(){
        System.out.println("汪汪汪");
    }
}