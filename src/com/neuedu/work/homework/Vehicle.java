package com.neuedu.work.homework;

public class Vehicle {
    String brand;
    String color;
    double speed=0;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle(String brand,String color,double speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }

    void run(){
        System.out.println("该车品牌为"+brand+"颜色为"+color+"速度为"+speed);
    }

    public static void main(String[] args) {
    }
}

class Car extends Vehicle {

    private int loader;

    public Car(String brand, String color, double speed,int loader) {
        super(brand,color,speed);
        this.loader=loader;
    }

    void run(){
        System.out.println("该车品牌为"+brand+"颜色为"+color+"速度为"+speed+"载人数"+loader);
    }
}



