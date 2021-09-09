package com.neuedu.work.day05;

public class Test_单例模式 {
    public static void main(String[] args) {
        //验证是否为单例
        MySingleton s1= MySingleton.getInstance();
        MySingleton s2= MySingleton.getInstance();
        System.out.println("s1==s2 is "+(s1==s2));
    }
}
/*
 * 单例模式的实现：
 *   1、构造器私有；
 *   2、有私有、静态、本类型的属性；
 *   3、有公共、静态、返回值是本类型的方法，方法体中返回自己的属性；
 *   4、其它正常使用的属性或者方法；
 */
class  MySingleton{
    private static MySingleton instance;


    private MySingleton(){}

    public static MySingleton getInstance(){
        if (instance == null){
            instance =new MySingleton();
        }
        return instance;
    }

    //再写其他属性和方法



}



