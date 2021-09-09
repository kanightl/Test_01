package com.neuedu.work.day0727;

import java.util.Objects;

public class Text_equals方法 {
    public static void main(String[] args) {
        Citizen c1 =new Citizen(1001,"tom");
        Citizen c2 =new Citizen(1001,"jerry");
        System.out.println( c1.equals(c2));

        String s1 = "通话";
        String s2 = "重地";
        System.out.println("s1.equals(s1) is "+s1.equals(s2));
        System.out.println("s1.hashCode()="+s1.hashCode());
        System.out.println("s2.hashCode()="+s2.hashCode());

    }
}


class Citizen {
    int id;
    String name;

    public Citizen(){}

    public Citizen(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Citizen citizen = (Citizen) o;
        if (citizen.id==this.id){
            return true;
        }else {
            return false;
        }
    }




}