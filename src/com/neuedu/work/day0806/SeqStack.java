package com.neuedu.work.day0806;

import java.io.Serializable;

public class SeqStack<T>  implements Stack<T>, Serializable {

    private static final long serialVersionUID=1L;
    private T[] array;//保存栈元素的数组
    private int top=-1;//栈顶指针，-1表示空栈
    private int capacity =10;//表示栈的容量，默认为10
    private int size=0;//栈内元素的个数

    public SeqStack(){
        array=(T[]) new Object[capacity];
    }

    public SeqStack(int capacity){
        this.capacity=capacity;
        array=(T[])new Object[capacity];
    }

    //扩容
    private void ensureCapacity(int capacity){
        T[] newArr=(T[]) new Object[capacity];
        this.capacity=capacity;
        System.arraycopy(array,0,newArr,0,size);
        array=newArr;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void push(T t) {
        if (size==array.length){
            ensureCapacity(size*2+1);
        }
        array[++top]=t;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return array[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()){
           throw new EmptyStackException();
        }
        return array[top];
    }
}
