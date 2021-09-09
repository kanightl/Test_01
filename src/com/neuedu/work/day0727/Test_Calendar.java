package com.neuedu.work.day0727;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;

public class Test_Calendar {
    public static void main(String[] args) {
        //获取表示当前日期和时间的对象
        Calendar c= Calendar.getInstance();
        System.out.println("c="+c);

        c.set(Calendar.YEAR,2019);//设置指定属性新的值
        c.set(Calendar.MONTH,11-1);
        c.set(Calendar.DATE,-5);//修改指定的属性，给增加指定的值

        System.out.println("年"+c.get(Calendar.YEAR));
        System.out.println("月"+(c.get(Calendar.MONTH)+1));
        System.out.println("日"+c.get(Calendar.DATE));
        System.out.println("一年中的第几天"+c.get(Calendar.DAY_OF_YEAR));

        //把Calendar转换为Date
        Date d=c.getTime();
        System.out.println(d);

        //获取指定时间的毫秒数
        Date d2=new Date();
        System.out.println("d2="+d2.getTime());
        Calendar c2=Calendar.getInstance();
        System.out.println("c2="+c2.getTimeInMillis());
        System.out.println("System.currentTimeMillis()="+System.currentTimeMillis());
    }
}
