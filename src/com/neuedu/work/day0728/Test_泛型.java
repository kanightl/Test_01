package com.neuedu.work.day0728;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_泛型 {
    public static void main(String[] args) {
        //没有泛型的代码
        List list=new ArrayList();
        list.add("aaa");
        list.add("bbbb");
        Iterator it=list.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
        System.out.println("-------------");

        //有泛型的代码
        List<String> list2=new ArrayList<>();
        list2.add("aaa");
        list2.add("bbbb");
        Iterator<String > it2 =list.iterator();
        while (it2.hasNext()){
            String s2=it2.next();
            System.out.println(s2);
        }

        System.out.println("---------");

        for (String s:list2
             ) {
            System.out.println(s);
        }
    }
}
