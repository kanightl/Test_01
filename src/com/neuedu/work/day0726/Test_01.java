package com.neuedu.work.day0726;

public class Test_01 {
    public static void main(String[] args) {
      //  Chest a = new Chest() //抽象类不能实例化


        Chest w =new Wardrobe();
        Chest c =new Cupboard();
        w.storage();
        c.storage();
        c.open();

    }
}

abstract class Chest{
    int width;
    int height;
    public Chest(){
        System.out.println("父类构造器");
    }
    public void open(){
        System.out.println("柜子可以打开");
    }
    public  abstract void storage();
}

class Wardrobe extends Chest{
    @Override
    public void storage() {
        System.out.println("衣柜可以放衣服");
    }
}

class Cupboard extends Chest{
    @Override
    public void storage() {
        System.out.println("橱柜可以放碗和筷子");
    }
}