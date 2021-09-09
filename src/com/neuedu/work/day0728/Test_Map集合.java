package com.neuedu.work.day0728;

import java.util.HashMap;
import java.util.Map;

public class Test_Map集合 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("a","aaaaaa");
        map.put("b","bbbb");
        map.put("c","ccccccccc");
        map.put("a","ddddddddd");
        System.out.println(map);
    }
}
