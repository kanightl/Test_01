package com.neuedu.work.day0727;

public class Test_包装类 {
    public static void main(String[] args) {
        //基本类型和包装类的转换

        int i=10;
        Integer i2=new Integer(i);
        int i3=i2.intValue();
        Integer i4=i;//jdk1.5以后可以自动转换

        //字符串与基本类型转换
        String s="123";//"123q"
        int i5=Integer.parseInt(s);
        String s2=""+i5;
        String s3="ff";
        int i6=Integer.parseInt(s3,16);
        System.out.println("i6="+i6);
    }
}
