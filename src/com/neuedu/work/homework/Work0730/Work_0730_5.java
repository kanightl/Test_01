package com.neuedu.work.homework.Work0730;

public class Work_0730_5 {
    private static int count = 0;

    public static void main(String[] args) {

        hanio(3, '1', '2', '3');
        System.out.println(" 总共移动了 " + count + " 次");
    }

    /**
     * 移动
     * @param n 共需要移动的盘子
     * @param x 从起始位置
     * @param y 借助辅助塔
     * @param z 移动到终止位置
     */
    public static void hanio(int n, char x, char y, char z) {
        count++;
        if (n == 1) {
            move(x, n, z);
        } else {
            hanio(n - 1, x, z, y);
            move(x, n, z);
            hanio(n - 1, y, x, z);
        }
    }

    /**
     * 打印移动
     * @param x 从起使位置
     * @param n 移动第几个盘子
     * @param y 要移动到的最终位置
     */
    private static void move(char x, int n, char y) {
        System.out.println(" Move " + n + " from " + x + " to " + y);
    }
}
