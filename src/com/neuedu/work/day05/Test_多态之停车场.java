package com.neuedu.work.day05;

public class Test_多态之停车场 {
    public static void main(String[] args) {
        Park p =new Park();
        p.chargeFee(new Car(),6);
        p.chargeFee(new Truck(),5);
        p.chargeFee(new Bus(),9);
    }
}

interface Vehicle{
    public double getFree();
}

class Car implements Vehicle{
    @Override
    public double getFree() {
        System.out.println("I am car.");
        return 8.0;
    }
}

class Truck implements Vehicle{
    @Override
    public double getFree() {
        System.out.println("I am truck.");
        return 12.0;
    }
}

class Bus implements Vehicle{
    @Override
    public double getFree() {
        System.out.println("I am bus.");
        return 15.0;
    }
}

class Park {
    public void chargeFee(Vehicle v,int hours){
        double fee =v.getFree();
        System.out.println("您停了"+hours+"小时"+"每小时费用"+fee+"应收"+(fee*hours));
    }
}