package com.neuedu.work.day0729.Algorithm;

public class Test_斐波那契数列 {
    public static void main(String[] args) {
          for (int i=1;i<=10;i++){
              System.out.print(f(i)+" ");
          }
        System.out.println("----------------------");

//        long begin=System.currentTimeMillis();
//        int m=f(40);
//        System.out.println("m="+m);
//        long end=System.currentTimeMillis();
//        System.out.println("花费时间:"+(end-begin));
//
//         begin=System.currentTimeMillis();
//         int[] a=new int[40];
//         m=f(40,a);
//        System.out.println("m2="+m);
//         end=System.currentTimeMillis();
//        System.out.println("花费时间:"+(end-begin));
    }

    public static int f(int n){
         if (n==1){
             return 1;
         }
         if (n==2){
             return 1;
         }
         return f(n-1)+f(n-2);
    }

    public static int f(int n,int[] a){
        if (n==1){
            return 1;
        }
        if (n==1){
            return 1;
        }
        //从n=3开始，把第n个数使用数组保存，保存为a[n-1]
        if (a[n-1]>0){
            return a[n-1];
        }
        //如果a[n-1]还是0，则表示之前没有计算过
        a[n-1] = f(n-1, a) + f(n-2, a);
        return a[n-1];
    }
}
