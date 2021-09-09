package com.neuedu.work.day0802;

import java.util.Arrays;

public class Test_二路归并排序 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    //进行排序，递归调用
    public static void mergeSort(int[] a, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            //对左右两个子序列再次进行二路归并排序
            mergeSort(a, temp, low, mid);
            mergeSort(a, temp, (mid+1), high);
            //把两个子序列进行合并
            merge(a, temp, low, mid, high);
        }

    }

    //对两部分子序列合并排序
    public static void merge(int[] a, int[] temp, int low, int mid, int high) {
        //创建临时变量，表示两个子序列的动态索引
        int i = low;//表示前半个子序列的索引
        int j = mid + 1;//表示后半个子序列的索引
        int k = 0; //表示temp数组的索引

        //比较两个子序列的值，取小的填充到temp数组
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }

        //把temp数组中的值拷贝到数组中
        k = 0;
        while (low <= high) {
            a[low++] = temp[k++];
        }
    }
}
