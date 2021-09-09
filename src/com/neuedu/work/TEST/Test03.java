package com.neuedu.work.TEST;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {
            boolean b = false;

            for (int j = 2; j <= i - 1; j++) {

                if (i % j == 0) {
                    b = false;
                    break;
                }
                else {
                    b = true;
                }
            }

            if (b == true) {
                System.out.println(i);
            }
        }


    }
}
