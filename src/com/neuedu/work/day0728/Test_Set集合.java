package com.neuedu.work.day0728;

import java.util.*;

public class Test_Set集合 {
    public static void main(String[] args) {
        //创建集合对象
        Set set = new HashSet<>();
        Set set2 = new HashSet(8);

        //无序，集合中存储元素的顺序与向集合中放入元素的顺序不一致
        //重复，两个对象使用equals方法比较返回true，就是重复

        //向集合增加元素
        //set使用对象的equals（）方法来判断是否重复
        set.add("user0");
        set.add("user2");
        set.add("user1");
        set.add("user1");
        System.out.println(set);

        //集合转为数组
        Object[] objs = set.toArray();
        System.out.println(Arrays.toString(objs));



        //删除集合
        set.remove("user1");
        System.out.println(set);
        set.remove(0);
        System.out.println(set);

        //清空集合
        set.clear();
        System.out.println(set);
    }
}
