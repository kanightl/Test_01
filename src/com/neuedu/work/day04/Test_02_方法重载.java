package com.neuedu.work.day04;

public class Test_02_方法重载 {
    public static void main(String[] args) {
//        int end =10;
//        System.out.println("sum="+getSum(end));
//        int begin =1;
//        System.out.println("sum="+getSum(begin,end));

        //练习创建两个重载方法getSum(double end)，getSum（double begin，double end）
        double end =1.0;
        System.out.println("sum="+getSum(end));
        double begin=0.0;
        System.out.println("sum="+getSum(begin,end));

    }

    public static int getSum(int end){
        int sum =0;
        for (int i=1;i<=end;i++){
            sum+=i;
        }
        return sum;
    }

    public static int getSum(int begin,int end){
        int sum =0;
        for (;begin<=end;begin++){
            sum+=begin;
        }
        return sum;
    }

    public static  double getSum(double end){
        double sum =0.0;
        for (double i =0.1;i<=end;){
            sum+=i;
            i+=0.1;
        }
        return sum;
    }

    public static  double getSum(double begin,double end){
        double sum =0.0;
        for (double i =begin;i<=end;i=i+0.1){
            sum+=i;
        }
        return sum;
    }
}
