package com.neuedu.work.day0729.Algorithm;

public class Test_递归_字符串倒序 {
    public static void main(String[] args) {
        String s="abcdefg";
        s=reverse(s);
        System.out.println(s);
    }

    public static String reverse(String  s){
        if (s.length()==1){
            return s;
        }
        return reverse(s.substring(1))+s.substring(0,1);
    }
}
