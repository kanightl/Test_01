package com.neuedu.work.day0728;

import java.util.LinkedList;

public class Test_模拟栈 {
    public static void main(String[] args) {
    MyStack m=new MyStack();
        m.push("aa");
        m.push("bb");
        m.push("cc");
        m.push("dd");
        while (m.size()>0){
            System.out.println(m.pop());
        }
    }
}

//创建一个类，以LinkList作为属性，模拟栈或者队列
class MyStack{
    private LinkedList list=new LinkedList();
    //入栈
    public void push(Object obj){
        list.addLast(obj);
    }
    //出栈
    public Object pop(){
        return list.removeLast();//栈，后进先出
//        return list.removeFirst();//队列先进先出
    }
    //获取栈内元素个数
    public int size(){
        return list.size();
    }
}
