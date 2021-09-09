package com.neuedu.work.day0729;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test_字节流使用 {
    public static void main(String[] args) throws Exception {
        //创建文件对象
        File dir= new File("d:/io");
        File f=new File(dir,"b.txt");
        if ((!dir.exists())){
            dir.mkdirs();
        }

       //创建输出流文件写数据
        FileOutputStream fos=new FileOutputStream(f);
        String s="abcd\r\n12345\r\n好好学习";
        fos.write(s.getBytes());
        fos.close();//释放资源
        System.out.println("写文件ok");
        //创建输入流文件读取数据
        FileInputStream fis=new FileInputStream(f);
        //读法1，每次读取一个字节，然后转为字符输出，汉子会乱码
//        int i  =-1;
//        while ((i=fis.read())!=-1){
//            System.out.print((char)i);
//        }
//        fis.close();
        //读法2，每次读取一个字节数组，然后转为字符串输出，汉子不会乱码
        byte[] buf=new byte[fis.available()];
       fis.read(buf);
        System.out.println(new String(buf));
        fis.close();
    }


}
