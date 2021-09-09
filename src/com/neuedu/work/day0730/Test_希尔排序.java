package com.neuedu.work.day0730;

import java.util.Arrays;

public class Test_希尔排序 {
    public static void main(String[] args) {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] a){
        //先使用循环获取gap增量，表示增量，直到增量为1
        for (int gap=a.length/2;gap>0;gap/=2){
//            使用直接插入排序对每个分组进行排序
            //实际当gap==1时，下面的两层for循环就是之前讲的插入排序的代码
            for (int i=gap;i<a.length;i++){
                for (int j=i;j>=gap;j-=gap){
                    if(a[j]<a[j-gap]){
                        int temp=a[j];
                        a[j]=a[j-gap];
                        a[j-gap]=temp;
                    }
                }
            }

        }
    }
}
