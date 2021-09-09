package com.neuedu.work.day0802;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_计数排序 {
    public static void main(String[] args) {
        int[] a = {0, 2, 5, 3, 7, 9, 10, 3, 7, 6};
//        a=countSort(a);
//        System.out.println(Arrays.toString(a));
        int[] a2 = {101,109,108,102,110,107,103};
//        a2=countSort2(a2);
//        System.out.println(Arrays.toString(a2));
        a2=countSort3(a2);
        System.out.println(Arrays.toString(a2));


    }

    //基础版
//    public static int[] countSort(int[] a){
//        //先取得数组中的最大值
//        int max=a[0];
//        for (int i=1;i<a.length;i++){
////            if (max<a[i]){
////                max=a[i];
////            }
//            max=Math.max(max,a[i]);
//        }
//        //最大值+1为长度建立计数数组
//        int[] count=new int[max+1];
//
//
//        //遍历原数组的所有元素，在计数数组中的对应索引的元素值+1保存出现次数
//        for (int i=0;i<a.length;i++){
//            count[a[i]]++;
//        }
//
//        //4、创建临时数组
//        int[] temp=new int[a.length];
//
//        //5、遍历计数数组中大于0的索引，保存到临时数组中
//        int j=0;//临时数组使用的索引
//        for (int i=0;i<count.length;i++){
//            while (count[i]>0){
//                temp[j++]=i;
//                count[i]--;
//            }
//        }
//
//        return temp;
//    }


    //优化版
    public static int[] countSort2(int[] a){
        //先取得数组中的最大值
        int max=a[0];
        int min=a[0];
        for (int i=1;i<a.length;i++){
//            if (max<a[i]){
//                max=a[i];
//            }
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        //最大值+1为长度建立计数数组
        int[] count=new int[max-min+1];


        //遍历原数组的所有元素，在计数数组中的对应索引的元素值+1保存出现次数
        for (int i=0;i<a.length;i++){
            count[a[i]-min]++;
        }

        //4、创建临时数组
        int[] temp=new int[a.length];

        //5、遍历计数数组中大于0的索引，保存到临时数组中
        int j=0;//临时数组使用的索引
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                temp[j++]=i+min;
                count[i]--;
            }
        }

        return temp;
    }


    //进阶版
    public static int[] countSort3(int[] a){
        //先取得数组中的最大值
        int max=a[0];
        int min=a[0];
        for (int i=1;i<a.length;i++){
//            if (max<a[i]){
//                max=a[i];
//            }
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        //最大值+1为长度建立计数数组
        int[] count=new int[max-min+1];


        //遍历原数组的所有元素，在计数数组中的对应索引的元素值+1保存出现次数
        for (int i=0;i<a.length;i++){
            count[a[i]-min]++;
        }

        //对计数数组进行升级，第i+1索引位置的值=本身的值+第i个索引位置的值
        //计算数组升级后，第i个索引位置的值-1就是原数组中的值在结果数组中的索引
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }


        //4、创建结果数组
        int[] temp=new int[a.length];

        //5、遍历原数组中的所有值，获取改值对应的计数数组的索引
        //取得计数数组索引对应的值，-1之后就是原数组的值在结果数组的索引
        for (int i=a.length;i>=0;i--){
            temp[count[a[i]-min]-1]=a[i];
            count[a[i]-min]--;
        }


        return temp;
    }



}
