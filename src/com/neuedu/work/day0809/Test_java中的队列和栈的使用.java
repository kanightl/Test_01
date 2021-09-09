package com.neuedu.work.day0809;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class Test_java中的队列和栈的使用 {
    public static void main(String[] args) {
        //单端队列
        Queue<String> q=new LinkedList<>();
        q.add("a");
        q.add("b");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println("--------------------");

        //双单队列
        Deque<String> q2=new LinkedList<>();
        q2.addFirst("a");
        q2.addLast("b");
        while (!q2.isEmpty()){
            System.out.println(q2.pollLast());
        }
        System.out.println("------------------");

        //栈
        Stack<String> c=new Stack<>();
        c.push("a");
        c.push("b");
        while (!c.isEmpty()){
            System.out.println(c.pop());
        }
    }
}
