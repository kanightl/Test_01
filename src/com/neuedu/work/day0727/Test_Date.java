package com.neuedu.work.day0727;

import java.util.Date;

public class Test_Date {
    public static void main(String[] args) {
        //最常见的创建当前日期和时间的对象
        Date d=new Date();
        System.out.println("d="+d);

        //创建指定日期的对象
        Date d2 =new Date(2021-1900,4,4);//年份-1900，月份要-1
        System.out.println("d2="+d2);
    }
}
