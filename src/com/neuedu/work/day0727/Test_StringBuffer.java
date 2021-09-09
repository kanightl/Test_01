package com.neuedu.work.day0727;

public class Test_StringBuffer {
    public static void main(String[] args) {
        //StringBuffer的使用
        StringBuffer s=new StringBuffer("abc");
        s.append("def");//直接修改对象本身，在结尾附加def字符串
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        //StringBuffer没有重写equals()方法，如果要比较值是否相等，需要先转为字符串再比较
        StringBuffer s1=new StringBuffer("abc");
        StringBuffer s2=new StringBuffer("abc");
        System.out.println("s1.equals(s2)="+s1.equals(s2));
        System.out.println("s1.equals(s2)="+s1.toString().equals(s2.toString()));


        //StringBuilder的使用,与StringBuffer的使用一样
    }
}
