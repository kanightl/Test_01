package com.neuedu.work.day0809;


//哈希表，用于管理多个链表
public class HashTab {
    private EmpList[] list;
    private int size=10;//默认链表个数

    public HashTab(int size){
        this.size=size;
        list=new EmpList[size];
        for (int i=0;i<list.length;i++){//初始化所有链表
            list[i]=new EmpList();
        }
    }

    public void add(Emp e){
        //根据函数计算该雇员属于哪个链表，然后加入对应链表
        int i=hashFun(e.id);
        list[i].add(e);

    }

    public void list(){
        for (int i=0;i<list.length;i++){
            list[i].list(i);
        }
    }

    //根据id查找雇员
    public void findEmpById(int id){
        //首先定义该id属于哪个链表
        int i=hashFun(id);
        Emp e2=list[i].findById(id);
        if (e2!=null){
            System.out.printf("找到id为%d的记录了，name为:%s",id,e2.name);
        }else {
            System.out.println("没有找到");
        }
        System.out.println();
    }

    private int hashFun(int id){
        return id%size;
    }
}
