package com.neuedu.work.day0729.Algorithm;

import java.util.Arrays;

public class Test_快速排序 {
    public static void main(String[] args) {
        int[] arr = {5,3,7,6,4,1,0,2,9,10,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] a ,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public  static void quickSort(int[] a,int low,int high){
        if (low<high){
            int pivot=a[low];//设置基准值
            int i=low;
            int j=high;

            while (i<j  ){
                //当i==j是，就确定了基准值位置
                while (i<j && a[j]>=pivot){//当本循环结束是，应该是找到的a[j]值小于基准值
                    j--;
                }
                swap(a,i,j);
                while (i<j && a[i]<=pivot){
                    i++;
                }
                swap(a,i,j);
            }
            //继续对基准值之前和之后的内容进行快速排序
            quickSort(a,low,i-1);
            quickSort(a,i+1,high);

        }
    }

}
