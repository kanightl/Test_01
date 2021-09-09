package com.neuedu.work.homework;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
//        (1)
//        int a=10;
//        int b=5;
//        int c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println("a="+a+"b="+b);


//        (2)
//        int i=689;
//        int a=i%10;
//        int b=i/10%10;
//        int c=i/100;
//        System.out.println("个位数相加结果"+(a+b+c));

//        (3)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("转换摄氏度输入1，转换华氏度输入22：");
//        int a = sc.nextInt();
//        if (a==1){
//            System.out.println("请输入华氏度:");
//            int i = sc.nextInt();
//            int j;
//            j=(i-32)*5/9;
//            System.out.println("转换为摄氏度为:"+j);
//        }
//        else if (a==2){
//            System.out.println("请输入摄氏度:");
//            int i = sc.nextInt();
//            int j;
//            j=i*9/5+32;
//            System.out.println("转换为华氏度为:"+j);
//        }

//        (4)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个大写字母:");
//        char i = sc.next().charAt(0);
//        i = (char)(i+32);
//        System.out.println("小写字母为:"+i);



//        (5)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("这个月利润为:");
//        int i =sc.nextInt();
//        double j;
//        if(i<=10){
//            j=i*0.1;
//        }else if (i>10 && i<=20){
//            j=1+(i-10)*0.075;
//        }else if (i>20 && i<=40){
//            j=1.75+(i-20)*0.05;
//        }else if (i>40 && i<=60){
//            j=2.75+(i-40)*0.03;
//        }else if (i>60 && i<=100){
//            j=3.35+(i-60)*0.015;
//        }else {
//            j=3.95+(i-100)*0.001;
//        }
//        System.out.println("应发奖金:"+j+"万元");




//        (6)
//        int a =75;
//        switch (a/10){
//            case 10:
//            case 9:
//                System.out.println("等级为A");break;
//            case 8:
//                System.out.println("等级为B");break;
//            case 7:
//                System.out.println("等级为C");break;
//            case 6:
//                System.out.println("等级为D");break;
//            default:
//                System.out.println("等级为E");break;
//        }



//        (7)
//        double i=30000;
//        int sum =30000;
//        for (int j =0;j<9;j++){
//            i=i*1.06;
//            sum+=i;
//        }
//        System.out.println("未来10年的总收入为:"+sum);


//        (8)
//        int num=1;
//        for (int i=1;i<10;i++){
//            num=(num+1)*2;
//        }
//        System.out.println("第一天摘了:"+num);

//        (9)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个数:");
//        int a =sc.nextInt();
//        if (a%2==0){
//            System.out.println("这是一个偶数");
//        }else if (a%2==1){
//            System.out.println("这是一个奇数");
//        }

//        (10)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个数:");
//        int x =sc.nextInt();
//        switch (x){
//            case 1:
//                System.out.println("x=1");break;
//            case 5:
//                System.out.println("x=5");break;
//            case 10:
//                System.out.println("x=10");break;
//            default:
//                System.out.println("x=none");break;
//        }

//        (11)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个数:");
//        int x =sc.nextInt();
//        if (x%5==0 && x%6==0){
//            System.out.println("能被5和6整除");
//        }else if (x%5==0 && x%6!=0){
//            System.out.println("能被5整除");
//        }else if(x%5!=0 && x%6==0){
//            System.out.println("能被6整除");
//        }else {
//            System.out.println("不能被5或6整除");
//        }

//        (12)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个数:");
//        int a =sc.nextInt();
//        if ((a%4==0 && a%100!=0)||(a%400==0)){
//            System.out.println("是闰年");
//        }else {
//            System.out.println("不是闰年");
//        }

//        (13)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个数:");
//        int a =sc.nextInt();
//        if (a<=100 && a>=0){
//                switch (a/10){
//                    case 10:
//                    case 9:
//                        System.out.println("等级为A");break;
//                    case 8:
//                        System.out.println("等级为B");break;
//                    case 7:
//                        System.out.println("等级为C");break;
//                    case 6:
//                        System.out.println("等级为D");break;
//                    default:
//                        System.out.println("等级为E");break;
//            }
//        }else {
//            System.out.println("分数无效");
//        }

//        (14)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入x:");
//        int x =sc.nextInt();
//        System.out.println("输入y:");
//        int y =sc.nextInt();
//        System.out.println("输入z:");
//        int z =sc.nextInt();
//        if (x>y){
//            if (y>z){
//                System.out.println(z+"<"+y+"<"+x);
//            }else if (x>z){
//                System.out.println(y+"<"+z+"<"+x);
//            }else {
//                System.out.println(y+"<"+x+"<"+z);
//            }
//        }else {
//            if (z < x) {
//                System.out.println(z+"<"+x+"<"+y);
//            }else if (y>z){
//                System.out.println(x+"<"+z+"<"+y);
//            }else {
//                System.out.println(x+"<"+y+"<"+z);
//            }
//        }

//        (15)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入正整数:");
//        int x =sc.nextInt();
//        int num =0;
//        int a=x/10000%10;
//        int b=x/1000%10;
//        int c =x/100%10;
//        int d =x/10%10;
//        int e =x%10;
//        while (x>0){
//            x/=10;
//            num++;
//        }
//        System.out.println("这个数是"+num+"位数");
//        System.out.println("万位"+a);
//        System.out.println("千位"+b);
//        System.out.println("百位"+c);
//        System.out.println("十位"+d);
//        System.out.println("个位"+e);

//        (16)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入汇款金额:");
//        int x =sc.nextInt();
//        double a;
//        if (x<100){
//            a=1;
//        }else if (x>=100 && x<=5000){
//            a=x*0.01;
//        }else {
//            a=50;
//        }
//        System.out.println("汇费:"+a);

//        (17)
//        int sum=0;
//        for (int i=1;i<100;i++){
//            if (i%3==0){
//                sum+=i;
//            }
//        }
//        System.out.println("1到100能被3整除的数的和:"+sum);
//        int sum=0;
//        int i=1;
//        while (i<100){
//            if (i%3==0){
//                sum+=i;
//            }
//            i++;
//        }
//        System.out.println("1到100能被3整除的数的和:"+sum);
//        int sum =0;
//        int i=1;
//        do{
//            if (i%3==0){
//                sum+=i;
//            }
//            i++;
//        }while (i<100);
//        System.out.println("1到100能被3整除的数的和:"+sum);

//        (18)
//        int i;
//        for ( i=0;i<=9;i++) {
//            if (i == 5) {
//
//            } else {
//                System.out.println(i);
//            }
//        }

//        (19)
//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入一个整数:");
//        int x =sc.nextInt();
//        int a=1;
//        for(int i=1;i<=x;i++){
//            a*=i;
//        }
//        System.out.println(a);

//        (20)
//        int n = 201,i;
//        while(true){
//            for(i=2;i<n/2;i++){
//                if(n%i==0){
//                    break;
//                }
//            }
//            if(i>=n/2){
//                System.out.println("大于200的最小的质数为："+ n);
//                break;
//            }
//            n++;
//        }

//        (21)
          Scanner sc=new Scanner(System.in);
          System.out.println("请输入一个整数");
          int num=sc.nextInt();
          while(num!=0){
              int a=num%10;
              System.out.print(a);
              num=num/10;
          }



    }
}
