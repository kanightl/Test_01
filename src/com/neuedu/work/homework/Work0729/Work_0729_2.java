package com.neuedu.work.homework.Work0729;

import java.util.LinkedList;

public class Work_0729_2 {
    public static void main(String[] args) {
        Mystark m = new Mystark();
        m.put("aaa");
        m.put("bbb");
        m.put("cccc");
        m.put("dddd");
        while (m.isEmpty() == true) {
            System.out.println(m.get());
        }
    }
}

class Mystark {
    private LinkedList list = new LinkedList();

    public void put(Object o) {
        list.addLast(o);
    }

    public Object get() {
        return list.removeFirst();
    }

    boolean isEmpty() {
        if (list.size() == 0) {
            return false;
        }
        return true;
    }
}