package com.neuedu.work.day03;

import java.util.Arrays;

public class Test_04 {
    public static void main(String[] args) {
//        数组复制
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        System.arraycopy(a,0,b,1,4);
        System.out.println("b="+ Arrays.toString(b));


//        //数组排序
//        int[] a= {1, 6, 2, 3, 9, 4, 5, 7, 8};
//        System.out.println("排序前:"+ Arrays.toString(a));
////        Arrays.sort(a);//工具提供的快速排序
//        Arrays.sort(a,2,7);//对2-7的元素进行排序
//        System.out.println("排序后"+Arrays.toString(a));






    }
}
