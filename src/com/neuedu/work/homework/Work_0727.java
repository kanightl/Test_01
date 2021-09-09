package com.neuedu.work.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Work_0727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("指定编号长度");
        double a = sc.nextDouble();
        Random r = new Random();
        String str = "";
        for (int i = 0; i < a; i++) {
            int b = (int) (Math.random() * 36);
            if (b < 10) {
                str += r.nextInt(10);
            } else if (b > 10) {
                str += (char) (Math.random() * 26 + 'A');
            }
        }
        System.out.println(str);
    }
}
