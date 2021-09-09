package com.neuedu.work.day0802;

import java.util.Arrays;

public class Test_自定义数组 {
    public static void main(String[] args) throws Exception {
        MyArray m=new MyArray(6);
        m.insert(0,10);
        m.insert(1,11);
        m.insert(2,12);
        m.insert(3,13);
        m.insert(4,14);
        m.insert(5,15);
        m.insert(6,16);
//        m.insert(6,15);//数组越界

        int i=m.remove(3);
        System.out.println("i="+i);
        m.output();
    }


}

class MyArray{
    private int[] array;
    private int size;

    public MyArray(){
        array=new int[10];
        size=0;
    }

    public MyArray(int capacity){
        array=new int[capacity];
        size=0;
    }

    //向指定位置插入新元素
    public void insert(int index,int data) throws Exception{
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("要插入的suoy超出范围:"+index);
        }

        //对数组进行需要扩容
        if (size>=array.length){
            resize();
        }

        //从后往前，把指定位置后面的元素都后移一位
        for (int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }

        //把新值放到指定索引位置
        array[index]=data;
        size++;
    }

    public void output(){
        for (int i=0;i<size;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }

    //对数组进行扩容
    public void resize(){
        int[] newarr=new int[array.length*2];
        System.arraycopy(array,0,newarr,0,array.length);
        array=newarr;//设置array变量指向新数组
    }

    //删除指定索引位置的元素
    public int remove(int index) throws Exception{
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("要插入的suoy超出范围:"+index);
        }
        int temp=array[index];//取得被删除的值

        //从左向右把被删除元素后面的元素依次向前移位
        for (int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
        return temp;
    }



}