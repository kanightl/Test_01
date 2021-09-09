package com.neuedu.work.day0726;

public class Test_内部类 {
    public static void main(String[] args) {
       //需要先创建外部类对象，然后才能创建内部类对象
        Outer o =new Outer();
        Outer.Inner i =o.new Inner();
        i.sayHello();
    }
}

class Outer{
    private String name="tom";

    class Inner{


        public void sayHello(){
            System.out.println("Hello" +name);
        }
    }
}

