package com.neuedu.work.day0802;

import java.util.Arrays;

public class Test_基数排序 {
    public static void main(String[] args) throws Exception {
        int[] arr = {26,3,49,556,81,9,863,0};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] a) {
        //取得数组中的最大值
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int exp = 1;//设置基数

        //使用for循环根据最大值判断循环条件 （max/exp>0）就可继续循环
        for (; max / exp > 0; exp *= 10) {
            //创建计数数组
            int[] count = new int[10];
            //遍历原数组，填充计数数组的值
            for (int i = 0; i < a.length; i++) {
                count[a[i] / exp % 10]++;
            }
            //对计数数组的值累加处理
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }
            //创建结果数组
            int[] temp = new int[a.length];

            //遍历原数组，根据每个值在计数数组中的索引的值，计算原数组的值在结果数组中的索引
            for (int i = a.length-1; i >= 0; i--) {
                temp[ count[ a[i] / exp % 10] - 1] = a[i];
                count[a[i] / exp % 10]--;
            }

            System.arraycopy(temp, 0, a, 0, a.length);
        }


    }
}
