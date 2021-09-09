package com.neuedu.work.day0726;

public class Test_异常处理 {
    public static void main(String[] args) {

//        hehe();

        try {
//            int i =5/0;
            String s =null;
            int i =s.charAt(1);
            System.out.println("--haha");
        }catch (ArithmeticException e){
            System.out.println("1 "+e.getMessage());
        }catch (RuntimeException e){
            System.out.println("2 "+e.getMessage());
        }catch (Exception e){
            System.out.println("3 "+e.getMessage());
        }finally {
            System.out.println("--hehe");
        }


    }


    public static void haha(){
        int[] a={1,2,3};
        a[4]=5;//未进行异常处理，虚拟机执行到本代码后停止，后续代码不执行
        System.out.println("haha,能看到我执行吗");
    }

    public static void hehe(){
        int[] a={1,2,3};
        try {
            a[4] = 5;
            System.out.println("haha");
        }catch (Exception e){
            e.printStackTrace();//一定要有本行代码，调试bug使用的
        }
        System.out.println("hehe,能看到我执行吗");
    }
}


