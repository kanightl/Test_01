package com.neuedu.work.day0726;

public class Test_自定义异常 {
    public static void main(String[] args) {
        /*
        当jdk提供的异常不能够满足编程需求时，我们可以自定义异常来使用，
        步骤，创建一个类去继承已有的异常类
        	然后提供有参构造器和getMessage()方法即可。
         */
        try {
            throw new MyException("我的异常");
        }catch (MyException e){
            e.printStackTrace();
        }

    }
}

class  MyException extends Exception{
    public MyException(){}

    public MyException(String name){
        super(name);
    }

    @Override
    public String getMessage() {
        return "代码有异常，请处理!";
    }
}

