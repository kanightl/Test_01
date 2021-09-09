package com.neuedu.work.homework.Work0730;

import java.io.*;

public class Work_0730_1 {
    public static void main(String[] args) throws Exception {
        File dir = new File("d:/io");
        File f = new File(dir, "Demo1.txt");
        File f2 = new File(dir, "Demo2.txt");
        File f3 = new File(dir, "Test.txt");
        if ((!dir.exists())) {
            dir.mkdirs();
        }
        String s = "hello";
        String s2 = "Neuedu";
        write(f, s);
        write(f2, s2);
        String s4 = read(f) + read(f2);
        write(f3, s4);
    }

    public static void write(File f, String s) throws Exception {
        FileWriter fw = new FileWriter(f, true);
        fw.write(s);
        fw.close();
        System.out.println("写入成功");
    }

    public static String read(File f) throws Exception {
        FileReader fr = new FileReader(f);
        int i = -1;
        String s3 = "";
        while ((i = fr.read()) != -1) {
            s3 += "" + (char) i;
        }
        fr.close();
        return s3;
    }
}
