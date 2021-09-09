package com.neuedu.work.day0726;

public class Test_异常练习 {
    public static void main(String[] args) {
        System.out.println(haha());
    }

    public static int haha(){
        int i =0;

        try {
            i++;
            return ++i;//理解为不要返回的值暂存，然后再去执行finall
        }catch (Exception e){//不执行，try没有报异常
            i++;
            return ++i;
        }finally {
            i++;
        }
    }
}
