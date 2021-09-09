package com.neuedu.work.day0727;

public class Test_字符串的方法 {
    public static void main(String[] args) {
        String s = "this is a test!";
        System.out.println("s.length()="+s.length());
        System.out.println("s.charAt(3)="+s.charAt(3));
        System.out.println("s.substring(1,4)="+s.substring(1,4));
        System.out.println("s.substring(4)="+s.substring(4));
        System.out.println("s.indexOf('i')="+s.indexOf('i'));
        System.out.println("s.indexOf('i',3)="+s.indexOf('i',3));
        System.out.println("s.indexOf(\"is\",3)="+s.indexOf("is",3));
        System.out.println("s.indexOf('z')=" + s.indexOf('z'));
        System.out.println("s.lastIndexOf('s')="+s.lastIndexOf('s'));
        System.out.println("s.replace('i','I')="+s.replace('i','I'));
        System.out.println("s.replaceAll(\"is\",\"IS\")="+s.replaceAll("is","IS"));

        //练习：String s3 = "d:/aaa/bb/c.txt";取字符串表示的文件名的路径、文件名、扩展名；

        String s3="d:/aaa/bb/c.txt";
        System.out.println("路径"+s3.substring(0,s3.lastIndexOf('/')));
        System.out.println("文件名"+s3.substring(s3.lastIndexOf('/')+1));
        System.out.println("扩展名"+s3.substring(s3.lastIndexOf('.')));

        String s2= "abecedkjkacedjkdseddklj";

        int num =0;
        for (int i=0;i<s2.length();i++){
               char a=s2.charAt(i);
               if (a=='e'){
                   num++;
               }
        }
        System.out.println("e出现的次数"+num);
    }
}
