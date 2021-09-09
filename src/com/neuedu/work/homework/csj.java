package com.neuedu.work.homework;

import java.util.Scanner;

public class csj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            if (n > 127 || n < -128) {
                throw new ByteSizeException();
            }
        } catch (ByteSizeException e) {
            e.printStackTrace();
        }
    }
}

class ByteSizeException extends Exception {

    public ByteSizeException() {
    }

    @Override
    public String getMessage() {
        return "输入的数不是byte类型";
    }
}

