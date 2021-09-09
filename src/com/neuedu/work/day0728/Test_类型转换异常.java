package com.neuedu.work.day0728;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Test_类型转换异常 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("abc");
        list.add("ddd");
        list.add("12");

        for (Object obj:list
             ) {
            String s=(String)obj;
            System.out.println(s);

        }

    }
}
