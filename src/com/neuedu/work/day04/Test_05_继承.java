package com.neuedu.work.day04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.EnumMap;

public class Test_05_继承 {
    public static void main(String[] args) {
           Worker_05 w=new Worker_05();
           w.name="tom";
           w.birth="20212-03-17";

           w.getDetail();
           w.getSalary();
        System.out.println("allance is "+w.fressAllowance());
    }
}


class Employee{
    String name;
    String birth;
    double salary;


    Employee(int a){
        System.out.println("Employee()");
    }

    public void getDetail() {
        System.out.println("name="+name+"salary="+salary);
    }

    public double getSalary(){
        System.out.println("salary="+salary);
        return salary;
    }

}

class Worker_05 extends Employee{

    Worker_05(){
        super(5);
        System.out.println("Worker_05()");
    }

    public double fressAllowance(){
        double allance =200;
        return allance;
    }
}
