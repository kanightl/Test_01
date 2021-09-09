package com.neuedu.work.day0728;

import java.util.*;


public class Test_List遍历 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("user0");
        list.add("user1");
        list.add("user2");
        list.add("user3");

       printlist3(list);
//        printlist2(list);
//        printlist1(list);
    }

    public static void printlist1(Collection list){
        //迭代器
        Iterator it=list.iterator();
        while (it.hasNext()){//判断是否有下一个元素
            System.out.println(it.next());//返回下一个元素，并且游标下移一位
        }
    }

    public static void printlist2(List list){
        //for-each
        for (Object obj:list) {
            System.out.println(obj);
        }
    }

    public static void printlist3(List list){
        //普通for循环Object[] objs=list.toArray();
        //        for (int i=0;i<objs.length;i++){
        //            System.out.print(objs[i]+" ");
        //        }
//        Object[] objs=list.toArray();
//        for (int i=0;i<objs.length;i++){
//            System.out.print(objs[i]+" ");
//        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void printlist4(Collection list) {
        //转数组再遍历

    }
}
