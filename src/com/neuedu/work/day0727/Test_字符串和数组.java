package com.neuedu.work.day0727;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test_字符串和数组 {
    public static void main(String[] args) throws Exception {
        String s="abc哈哈";
        //字符串和char数组
        char[] c =s.toCharArray();
        System.out.println(Arrays.toString(c));
        String s2=new String(c);
        System.out.println("s2="+s2);

        //字符串和byte数组
        byte[] b1=s.getBytes();
        System.out.println("b1="+Arrays.toString(b1));
        byte[] b2=s.getBytes("utf-8");
        System.out.println("b2="+Arrays.toString(b2));
        String s3 =new String(b1);
        System.out.println("s3="+s3);
        String s4 = new String(b2, "gbk");
        System.out.println("s4=" + s4);
        String s5 = new String(b2, "utf-8");
        System.out.println("s5=" + s5);

    }
}
