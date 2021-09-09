package com.neuedu.work.day0730;

import java.util.Arrays;

public class Test_选择排序 {
    public static void main(String[] args) {
        int[] arr = {29, 38, 65, 87, 78, 23, 27, 29};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectSort(int[] a) {
        int minIndex;//表示 每次循环得最小值索引
        int temp;//临时变量，用于交换
        for (int i = 0; i < a.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    //如果第j个元素的值比最小索引的值小，则修改最小索引值为j
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
