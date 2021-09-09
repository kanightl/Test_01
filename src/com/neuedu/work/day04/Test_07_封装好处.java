package com.neuedu.work.day04;


public class Test_07_封装好处 {
    public static void main(String[] args) {
         // Dog_07没有特殊处理，不能对那么属性的读取和修改
        Dog_07 d=new Dog_07();
        d.name ="haha";
        System.out.println("d.name="+d.name);

        //Cat_07做了特殊处理，可以控制name属性的访问；
        Cat_07 c =new Cat_07();
    //    c.name="haha";//不能直接访问
        System.out.println("c.name="+c.getName());
    }
}

class Dog_07{
    String name ="tom";
}

class Cat_07{
    private String name ="jerry";
    public String getName(){//允许访问
        return name+"公主";
    }

    public void setName(String name){
        this.name=name;
    }
}