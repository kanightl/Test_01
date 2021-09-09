package com.neuedu.work.day03;

import java.util.Arrays;

public class Test_03 {
    public static void main(String[] args) {
//        //冒泡排序
//        int[] a= {1, 6, 2, 3, 9, 4, 5, 7, 8};
//        System.out.println("排序前:"+ Arrays.toString(a));
////        bubbleSort(a);
//        Arrays.sort(a);//工具提供的快速排序
//        System.out.println("排序后"+Arrays.toString(a));

        //二分法查找数组
        /**
         * 查找参数数组a是否包含目标值target
         * @param a 被查找的数组
         * @param target 查找的值
         * @return 如果找到，则返回值给索引，如果没找到，则返还-1
         */
//        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//         int t=6;
//         int index =binarySearch(a,t);
//         if (index>-1){
//             System.out.println("找到"+t+"了，位置是"+index);
//         }else {
//             System.out.println("没找到"+t);
//         }

        //二维数组最大值
//        int[][] a={
//                {1,76},
//                {2,85},
//                {3,93},
//                {4,68},
//                {5,81}
//        };
//
//        int max = a[0][1];
//        int id = a[0][0];
//        for ( int i =0;i<a.length;i++){
//            if (a[i][1]>max){
//                max=a[i][1];
//                id =a[i][0];
//            }
//        }
//        System.out.println("最大分数是"+max+"学号是"+id);
        //锯齿数组
//        int[][] b ={
//                {1,2,3,4},
//                {5,6},
//                {7,8,9,10,11},
//                {12,13,14}
//        };
//        for (int i=0;i<b.length;i++){
//            for (int j=0;j<b[i].length;j++){
//                System.out.print(b[i][j]+"  ");
//            }
//            System.out.println("---------------");

//            String[][] a = new String[5][];第二个中括号空着，表示锯齿数组
            String[][] a = new String[5][6];//第二个中括号有值，表示矩形数组
            for (int i = 0;i<a.length;i++){
                for (int j =0;j<a[i].length;j++){
                    a[i][j]="("+i+","+j+")";
                }
            }
            for (int i = 0;i<a.length;i++){
                for (int j =0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }



//        String[][] a =new String[][];










    }

//    public static void bubbleSort(int[] a) {
//        for(int i=0;i<a.length;i++) {
//            for (int j=0;j<a.length-1;j++){
//                if (a[j]>a[j+1]){
//                    int temp =a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//    }


//        public static int binarySearch(int[] a,int target){
//            int index =-1;//表示最终返回的结果
//            int low = 0;//查找区间的最小索引
//            int high =a.length-1;//查找区间的最大索引
//
//            while (high>=low){
//                int mid =(low+high)/2;//计算中值索引
//                if (target>a[mid]){//如果目标比中值大，则在后半部分
//                    low =mid+1;
//                }else if ( target==a[mid]){
//                    index =mid;
//                    break;
//                }else {//在前半部分找
//                    high =mid-1;
//                }
//            }
//
//
//            return index;
//        }
}
