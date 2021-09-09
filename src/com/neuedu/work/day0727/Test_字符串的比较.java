package com.neuedu.work.day0727;

public class Test_字符串的比较 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abg";
        //比较是否相等
        System.out.println("s1.equals(s2) is"+ s1.equals(s2));

        //比较大小
        int i=s1.compareTo(s2);
        System.out.println("i="+i);
    }

}
