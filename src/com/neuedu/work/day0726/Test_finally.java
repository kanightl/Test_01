package com.neuedu.work.day0726;

public class Test_finally {
    public static void main(String[] args) {
//        int i =haha();
//        System.out.println("i="+i);
        hehe();
    }

    public static void hehe(){
        try {
           int i=1/0;
            System.out.println("in try");
        }catch (Exception e){
            System.out.println("in catch");
//            return;
            System.exit(0);//表示正常终止虚拟机
        }finally {
            System.out.println("in finally");
        }
    }

    public static int haha(){
        int i =0;
        try{
            i=1;
            i=i/0;
            return i;
        }catch (Exception e){
            i=2;
            return i;
        }finally {
            i=3;
//            return i;
        }

    }
}
