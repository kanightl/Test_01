package com.neuedu.work.homework;

import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {
        Gardener g = new Gardener();
        g.create();
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("苹果")) {
            System.out.println(new Apple());
        }
        if (s.equals("香蕉")) {
            System.out.println(new Banana());
        }
        if (s.equals("葡萄")) {
            System.out.println(new Grape());
        }
    }
}

interface Fruit {

}

class Apple implements Fruit {
    public Apple() {
        System.out.println("创建一个苹果类的对象");
    }
}

class Banana implements Fruit {
    public Banana() {
        System.out.println("创建一个香蕉类的对象");
    }
}

class Grape implements Fruit {
    public Grape() {
        System.out.println("创建一个葡萄类的对象");
    }
}