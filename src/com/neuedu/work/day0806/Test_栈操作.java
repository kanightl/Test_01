package com.neuedu.work.day0806;

public class Test_栈操作 {
    public static void main(String[] args) {
//        SeqStack<Integer> s=new SeqStack<>();
//        System.out.println(" "+s.peek());
        SeqStack<Integer> s=new SeqStack<>(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.peek());
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(" "+s.peek());//报错
    }
}
