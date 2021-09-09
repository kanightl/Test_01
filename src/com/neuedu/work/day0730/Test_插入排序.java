package com.neuedu.work.day0730;

import java.util.Arrays;

public class Test_插入排序 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 3, 1, 5, 2, 4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] a) {
        //把待排序数字分为两个部分
        //1、下标为0的作为第一部分，是已排序的部分
        //2、下标为1到n-1的作为第二部分，是未排序的部分
        //每次外层循环从第二部分拿出一个值，通过内层循环判断它在第1部分中应该的位置；
        for (int i = 1; i < a.length; i++) {//I表示第二部分中每个元素下标
            for (int j = i; j > 0; j--) {//j表示第2部分中的元素的下标，判断与前一个元素的大小
                if (a[j] < a[j - 1]) {//如果比前元素小，则交换
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {//如意不比前面元素小，则其位置就是排好序的位置
                    break;
                }
            }
        }
    }
}
