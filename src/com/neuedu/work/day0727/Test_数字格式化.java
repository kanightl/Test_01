package com.neuedu.work.day0727;

import java.text.DecimalFormat;
import java.util.Random;

public class Test_数字格式化 {
    public static void main(String[] args) {
//        DecimalFormat df =new DecimalFormat("00.000");
//        DecimalFormat df2 =new DecimalFormat("##.###");
        double d= 3.1415927;
//        System.out.println("df.format(d)="+df.format(d));
//        System.out.println("df2.format(d)="+df2.format(d));


        //演示math类的几个方法的使用
//        System.out.println("Math.ceil(d)="+Math.ceil(d));
//        System.out.println("Math.floor(d)="+Math.floor(d));
//        System.out.println("Math.round(d)="+Math.round(d));
        for (int i=0;i<5;i++){
            System.out.println(Math.random());
        }
        Random r =new Random();
        for (int i =0;i<5;i++){
//            System.out.println(r.nextInt(10));//去0-9之间的数
            System.out.println(r.nextInt(100)+1);//去0-9之间的数
        }

    }
}
