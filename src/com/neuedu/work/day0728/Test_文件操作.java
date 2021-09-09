package com.neuedu.work.day0728;

import java.io.File;
import java.io.IOException;

public class Test_文件操作 {
    public static void main(String[] args) throws Exception {
        doCreate();
//        doList();
    }

    //列出某个目录中的内容（包括子目录和文件，显示目录名，文件的话显示文件大小）
    public  static void doList(){
        File dir =new File("c:/");
        if (dir.exists()){
            File[] list=dir.listFiles();
            for (File f:list){
                if (f.isDirectory()){
                    System.out.println(f.getName()+"是目录");
                }else {
                    System.out.println(f.getName()+"是文件，大小为"+f.length()+"字节");
                }
            }
        }else {
            System.out.println("该目录不存在");
        }
    }

    //创建目录和文件
    public static void doCreate() throws Exception {
        //创建一个file对象，表示d盘的io文件夹
        File dir=new File("d:/io");
        if (!dir.exists()){
            //如果目录不存在，就创建该目录
            dir.mkdirs();
            System.out.println("创建成功");
        }else {
            System.out.println("目录已存在");
        }

        //创建FIle对象，表示d:/io/a,txt文件
        File f=new File("d:/io/a.txt");
        File f2=new File("d:/io","a.txt");
        File f3=new File(dir,"a.txt");

        if (!f.exists()){
            f.createNewFile();
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件存在");
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.length());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
            System.out.println(f.getParent());

//            删除文件和目录
            boolean flag=dir.delete();
            f.delete();
            dir.delete();
            System.out.println("删除目录成功?"+flag);
        }


    }
}
