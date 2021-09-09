package com.neuedu.work.day0726;

import java.io.File;
import java.io.IOException;

public class Test_throws {
    public static void main(String[] args) {
//        haha();

        try {
            hehe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //异常处理方式1.使用try-catch-finally自行处理异常
    public static void haha() {
        File f = new File("x:/a.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //异常处理方式2，使用throws抛出异常，由调用者处理异常
    public static void hehe() throws IOException,NullPointerException {

         String s=null;
         s.charAt(2);

        File f =new File("x:/a.txt");
        f.createNewFile();
    }

}
