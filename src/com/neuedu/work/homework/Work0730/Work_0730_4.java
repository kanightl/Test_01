package com.neuedu.work.homework.Work0730;

public class Work_0730_4 {
    public static void main(String[] args) {
        System.out.print("每个月兔子对数：" + "  ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(f(i) + " ");
        }

    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
