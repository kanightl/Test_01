package com.neuedu.work.day04;

public class Test_01 {
    //方法传参
    public static void main(String[] args) {
        int x = 5;
        A y=new A();
        System.out.println("调用前,x="+x+",y.a="+y.a);

        y.add(x,y);
        System.out.println("调用后,x="+x+",y.a="+y.a);

    }



}

class A{
    int a;
    public A(){
        a=1;
    }
    public void add(int m, A n){
           m++;
           n.a++;
    }
}
