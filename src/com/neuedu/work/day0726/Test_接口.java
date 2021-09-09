package com.neuedu.work.day0726;

public class Test_接口 {
    public static void main(String[] args) {
        //我们习惯使用父类或父接口声明变量，等号右侧创建子类对象
      MyInterface m =new Myclass44();
      m.haha();
//		m.hehe(); //不能使用对象名调用静态方法
//		MyClass_44.hehe();//不行
      MyInterface.hehe(); //只能通过接口名来调用
    }
}

class Myclass44 implements MyInterface{
    @Override
    public void sayHello() {

    }

    public void sayHello2(){

    }
}

interface MyInterface {
    int age =20;
    public static final int age2 =30;
   // private int age3=20;//不能使用private修饰

    void sayHello();
    public abstract void sayHello2();
   // private void sayHello3();不能使用private修饰

    /*
    从jdk1.8开始，接口中的方法可以使用defau和stati来修饰
    *   1、default表示默认方法，有方法体，不需要子类覆盖即可使用；需要通过子类对象来调用；
	 *   2、static表示静态方法，有方法体；只能通过接口名来调用，不能通过子类对象调用；
     */
    public default void haha(){
        System.out.println("我是默认方法");
    }
    public static void hehe() {
        System.out.println("hehe，我是静态方法");
    }
}