package com.neuedu.work.day0806;

//定义栈接口类
public interface Stack<T> {

    //判断栈是否为空
    boolean isEmpty();

    //入栈
    void push(T t);

    //出栈，同时删除栈顶元素
    T pop();

    //返回栈顶元素，不删除
    T peek();
}
