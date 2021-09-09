package com.neuedu.work.day0728;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_List集合 {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();
        List list2 = new ArrayList(8);

        //向集合增加元素
        list.add("user0");
        list.add(0, "user2");
        list.add("user1");
        list.add("user1");
        System.out.println(list);

        //集合转为数组
        Object[] objs = list.toArray();
        System.out.println(Arrays.toString(objs));

        //修改集合中指定位置元素
        list.set(1, "user3");
        System.out.println(list);

        //删除集合
        list.remove("user1");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //清空集合
        list.clear();
        System.out.println(list);
    }
}
