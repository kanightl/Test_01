package com.neuedu.work.day0806;

import java.util.SplittableRandom;

public class Tset_队列的使用 {
    public static void main(String[] args) {
        SeqQueue<String> sq=new SeqQueue<>(4);
        String s1= sq.peek();
        System.out.println(s1);
//        String s2=sq.element();
//        System.out.println(s2);

        sq.add("a");
        sq.add("b");
        sq.add("c");
        sq.add("d");
        sq.add("e");
        System.out.println(sq.size());

        while (!sq.isEmpty()){
            System.out.println(sq.poll());
        }
    }
}
