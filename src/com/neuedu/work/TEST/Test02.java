package com.neuedu.work.TEST;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test02 {


    public static void main(String[] args) {
        HashMap<String, Student> h = new HashMap<>();
        Student s = new Student("tom", 20);
        Student s2 = new Student("jerry", 18);
        h.put("NO.1", s);
        h.put("NO.2", s2);



        Set<String> set = h.keySet();
        for (String key : set) {
            Student value = h.get(key);
            System.out.println(key + ":" + value.getName());

        }
    }


}














