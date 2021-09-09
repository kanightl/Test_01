package com.neuedu.work.day0729;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test_文件拷贝 {
    public static void main(String[] args)  throws Exception{
        //使用输入流读取源文件内容，通过输出流输出到目的文件
        File src=new File("d:/io/c.txt");
        File dst=new File("d:/io/haha.java");

        if (!src.exists()){
            System.out.println("源文件不存在");
            return;
        }

        //创建输入流和输出流对象
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dst);
        //进行拷贝
        int i=-1;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
        System.out.println("拷贝完成");
    }
}
