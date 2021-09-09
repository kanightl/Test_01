package com.neuedu.work.homework.Work0729;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Work_0729_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String s2 = String.valueOf(c);
        String[] str = s2.split(" ");
        for (String s3 : str
        ) {
            list.add(s3);
        }
        System.out.println(list);
    }
}
