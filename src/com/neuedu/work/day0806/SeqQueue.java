package com.neuedu.work.day0806;

import com.neuedu.work.homework.Work0729.A;

import java.io.Serializable;
import java.util.NoSuchElementException;

//顺序队列
public class SeqQueue<T> implements  Queue<T>, Serializable {

    private static final long serialVersionUID=1L;
    private T[] array;//保存队列的数组
    private int capacity =10;//表示队列的容量，默认为10
    private int front;//队头指针
    private int rear;//队尾指针
    private int size;

    public SeqQueue(){
        array=(T[]) new  Object[capacity];
        front=rear=0;
    }

    public SeqQueue(int capacity){
        this.capacity=capacity;
        array=(T[]) new  Object[capacity];
        front=rear=0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==rear;
    }

    @Override
    public boolean add(T date) {
        //先判断队列是否已满，如果满了扩容
        if ((rear+1)%array.length==front){
            enSureCapacity(array.length*2+1);
        }

        array[rear]=date;
        rear=(rear+1)%array.length;
        size++;
        return true;
    }

    @Override
    public boolean offer(T date) {
        //加入的元素不能为空
        if (date==null){
            throw new NullPointerException("加入的元素不为空");
        }
        //如果队列满了，则抛出异常
        if ((rear+1)%array.length==front){
            throw new IllegalArgumentException("队列已满");
        }

        array[rear]=date;
        rear=(rear+1)%array.length;
        size++;


        return false;
    }

    @Override
    public T peek() {

        return array[front];
    }

    @Override
    public T element() {
        if (isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        return peek();
    }

    @Override
    public T poll() {
        T temp=array[front];
        front=(front+1)%array.length;
        size--;
        return temp;
    }

    @Override
    public T remove() {
        if (isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        return poll();
    }

    @Override
    public void clearQueue() {
        for (int i=front; i!=rear ; i=(i+1)%array.length) {
            array[i] = null;
        }
        //复位
        front=rear=0;
        size=0;
    }

    //扩容
    private void enSureCapacity(int capacity){
        if (capacity<size){
            return;
        }

        T[] old=array;
        array=(T[]) new  Object[capacity];

        //拷贝元素
        int j=0;
        for (int i=front;i!=rear;i=(i+1)%old.length){
            array[j++]=old[i];
        }
        front=0;
        rear=j;
    }
}
