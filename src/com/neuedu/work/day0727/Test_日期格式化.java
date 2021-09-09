package com.neuedu.work.day0727;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_日期格式化 {
    public static void main(String[] args) throws Exception {
        //创建格式对象
//        String f="yyyy-MM-dd";
        String f="yyyy年MM月dd日";
        SimpleDateFormat sdf=new SimpleDateFormat(f);

        //把Date对象转为指定格式的字符创
        Date d=new Date();
        String s=sdf.format(d);
        System.out.println(s);

        //把指定格式的字符串转为日期
        String s2="2011-11-11";
        Date d2=sdf.parse(s2);
        System.out.println("d2="+d2);
    }
}
