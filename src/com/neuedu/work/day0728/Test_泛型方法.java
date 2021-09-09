package com.neuedu.work.day0728;

import java.util.Arrays;
import java.util.Scanner;

public class Test_泛型方法 {
    public static void main(String[] args) {
        String s=get("haha");
        System.out.println(s);

        Integer i=get(12);
        System.out.println(i);

       test(10,5);


        //获取控制台的整行字符串，以空格隔开的多个单词，转为数组；
        Scanner sc=new Scanner(System.in);
        String s2=sc.nextLine();
        String[] a=s2.split(" ");
        System.out.println(Arrays.toString(a));




    }

    public static<T> T get(T t){
        System.out.println(t);
        return t;
    }

    public static <T extends Comparable<T>> Integer test(T t1, T t2) {
        if (t1.compareTo(t2)>0){
            System.out.println("大于");
        }else {
            System.out.println("小于等于");
        }
        return null;
    }
}
