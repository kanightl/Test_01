package com.neuedu.work.day0728;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_Map遍历 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("a","aaaaaa");
        map.put("d","bbbb");
        map.put("b","ccccccccc");
        map.put("c" +
                " ","ddddddddd");

        pringMap2(map);
    }

    public static void pringMap(Map map){
//        Set<Map.Entry<String ,String >> set=map.entrySet();
        Object[] a=map.entrySet().toArray();
        for (Object obj:a) {
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void pringMap2(Map map){
//        Set<Map.Entry<String ,String >> set=map.entrySet();
        Object[] a=map.keySet().toArray();
        for (Object key:a) {
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
