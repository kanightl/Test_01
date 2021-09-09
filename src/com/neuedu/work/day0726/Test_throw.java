package com.neuedu.work.day0726;

public class Test_throw {
    public static void main(String[] args) throws Exception {
        /*
        throw关键字用于抛出异常
        用在catch块中，把异常二次抛出
        用在try块中，由程序员手动创建异常并抛出
         */

        try {
            System.out.println("我要创建异常并抛出");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("捕获异常，再次抛出");
            throw e;
        }

    }
}
