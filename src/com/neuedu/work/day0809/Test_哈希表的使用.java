package com.neuedu.work.day0809;

public class Test_哈希表的使用 {
    public static void main(String[] args) {
        HashTab h=new HashTab(5);
        for (int i=1;i<=10;i++){
            Emp e=new Emp(i,"tom_"+i);
            h.add(e);
        }

        h.list();
        System.out.println();
        h.findEmpById(8);
    }
}
