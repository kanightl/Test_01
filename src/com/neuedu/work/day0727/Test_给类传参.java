package com.neuedu.work.day0727;

public class Test_给类传参 {
    public static void main(String[] args) {
        //接受给类传两个整数，计算两个参数的和
        int i= Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        System.out.println("和为"+(i+j));
    }
}
