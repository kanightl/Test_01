package com.neuedu.work.day0729;

import java.io.*;

public class Test_字符流使用 {
    public static void main(String[] args) throws Exception {
        //创建文件对象
        File dir= new File("d:/io");
        File f=new File(dir,"c.txt");
        if ((!dir.exists())){
            dir.mkdirs();
        }

       //创建输出流文件写数据
//        FileWriter fw=new FileWriter(f,true);//true表示向文件末尾附加新数据
//        String s="abc";
//        fw.write(s);
//        fw.close();//释放资源
//        System.out.println("写文件ok");
        //创建输入流文件读取数据
        FileReader fr=new FileReader(f);
        //读法1，每次读取一个字节，然后转为字符输出
        int i  =-1;
        String s3="";
        while ((i=fr.read())!=-1){




        }

        fr.close();


    }
}
