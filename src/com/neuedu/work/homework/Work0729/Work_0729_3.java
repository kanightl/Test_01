package com.neuedu.work.homework.Work0729;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Work_0729_3 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");

        System.out.println("最大元素:" + Collections.max(list));
        System.out.println("最小元素:" + Collections.min(list));

        Object[] objs = list.toArray();
        Arrays.sort(objs);
        for (Object o : objs
        ) {
            System.out.println(o);
        }
    }
}
