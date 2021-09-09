package com.neuedu.work.homework;

public class Work03 {
    public static void main(String[] args) {
//        (1)
//        int[] a={10,20,30,40,50};
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }


//        (2)
//        String[] a =new String[]{"neusofteducation"};
//        String[] b={"\u0000"};
//        System.arraycopy(a,0,b,0,1);
//        System.out.println("字符数组b为"+ Arrays.toString(b));

//        (3)
//        int[] a={1,6,2,3,9,4,5,7,8};
//        System.out.println("排序前:"+ Arrays.toString(a));
//        Arrays.sort(a);//工具提供的快速排序
//        System.out.println("排序后"+Arrays.toString(a));

//        (4)
//        double[][] a=new double[][]{
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16},
//                {17,18,19,20}
//        };
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

//        (5)
//        int[] a=new int[]{18,25,7,36,13,2,89,63};
//        int max =a[0];
//        int i;
//        for ( i=0;i<a.length;i++){
//            if (a[i]>max){
//                max=a[i];
//            }
//        } System.out.println("最大数为"+max+"下标为"+(i-1));

//        (6)
//            int[] a= {1,2,3,4,5,6,7,8,9};
//            for (int i=a.length-1;i>-1;i--){
//                System.out.print(a[i]);
//            }

//        (7)
//        int[] a={1,2,2,3,4};
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a.length;j++){
//                if(a[i]==a[j] && i!=j){
//                        a[j]=0;
//                }
//            }
//            System.out.print(a[i]);
//        }

//        (8)
        int[] a={-10,2,3,246,-100,0,5};
        int sum = 0;
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++){
            sum = sum+a[i];
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        double ave = (double)sum/3;
        System.out.println("平均值"+ave);
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);



    }
}

