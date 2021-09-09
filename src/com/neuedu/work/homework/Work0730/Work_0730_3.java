package com.neuedu.work.homework.Work0730;

import java.io.File;

public class Work_0730_3 {
    public static void main(String[] args) {
        File dir = new File("c:/temp");
        File f = new File(dir, "abc.txt");
        File f2 = new File(dir, "def.txt");
        if ((!dir.exists())) {
            dir.mkdirs();
        }
        find(dir);
    }

    public static void find(File file) {
        System.out.println("路径是c:/temp的文件夹内的文件有:");
        File[] list = file.listFiles();
        for (File f : list
        ) {
            System.out.print("文件名:" + f.getName() + " ");
            System.out.println("路径名:" + f.getAbsolutePath());
            System.out.println("---------------------");
        }
    }
}
