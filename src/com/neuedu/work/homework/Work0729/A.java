package com.neuedu.work.homework.Work0729;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {


        try {
            int i= Integer.parseInt(args[0]);
            int j=Integer.parseInt(args[1]);
            System.out.println(i/j);

        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("总是被执行");
        }

    }
}
