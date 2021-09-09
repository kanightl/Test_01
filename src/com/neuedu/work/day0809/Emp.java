package com.neuedu.work.day0809;


//表示雇员是一个节点类
public class Emp {
    public int id;
    public String name;
    public Emp next;//指向下一个雇员

    public Emp(int id,String name){
        this.id=id;
        this.name=name;
    }

    
}
