package com.neuedu.work.day0727;

public class Test_字符串出现次数 {
    public static void main(String[] args) {
        //从控制台输入两个字符串，计算第1个字符创在第二个字符串出现的次数

        String s1="ab";
        String s2 = "abcedabsdabajab";
        String s3=s2.replace(s1,"");
        int count =(s2.length()-s3.length())/s1.length();
        System.out.println("count="+count);
    }
}
