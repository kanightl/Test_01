package com.neuedu.work.day0729.Algorithm;

import java.util.Arrays;


public class Test_冒泡排序 {
    public static void main(String[] args) {
        int[] a={9,8,5,4,2,0};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void bubbleSort(int[] a){
        for (int i=1;i<a.length;i++){
            for (int j =0;j<a.length-i;j++){
                int temp;
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
    }
}
