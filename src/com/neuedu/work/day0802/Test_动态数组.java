package com.neuedu.work.day0802;import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;import java.util.Arrays;public class Test_动态数组 {    public static void main(String[] args) throws Exception {        MyDynamicArray<String> m=new MyDynamicArray<>(6);        m.addFirst("a");        m.addLast("b");        m.insert(1,"c");        m.addFirst("d");        m.addLast("e");        System.out.println("m.getCapacity()="+m.getCapacity());        System.out.println("m.getSize()="+m.getSize());        m.addLast("f");        m.addLast("g");        System.out.println("m.getCapacity()="+m.getCapacity());        System.out.println("m.getSize()="+m.getSize());        System.out.println(m);        System.out.println(m.get(5));        System.out.println(m.cantains("f"));    }}//创建一个自定义的动态数组：可以进行扩容、缩容、在开头增加或删除元素、在结尾增加删除元素等class MyDynamicArray<E>{    private E[] array;//数组的容量就是最大长度    private int size;//数足的元素个数，即长度    public MyDynamicArray(int capacity){        array=(E[])new  Object[capacity];        size=0;    }    public MyDynamicArray(){        this(10);    }    //对数组扩容或缩容    private void resize(int capacity){        E[] newArray=(E[])new Object[capacity];        System.arraycopy(array,0,newArray,0,array.length);        array=newArray;    }    //向指定位置插入元素    public void insert(int index,E data) throws Exception{        if (index<0 ||index>size){            throw new ArrayIndexOutOfBoundsException("索引越界"+index);        }        //扩容        if (size>=array.length){            resize(array.length*2);        }        //移位        for (int i=size-1;i>=index;i--){            array[i+1]=array[i];        }        array[index]=data;        size++;    }    //在开头增加新元素    public void addFirst(E data) throws Exception{        insert(0, data);    }    //在结尾增加新元素    public void addLast(E data) throws Exception{        insert(size, data);    }    //删除指定位置的元素    public E remove(int index) throws Exception{        if(index<0 || index>=size){            throw new ArrayIndexOutOfBoundsException("索引越界"+index);        }        E e2=array[index];        //移位        for (int i=index;i<size-1;i++){            array[i]=array[i+1];        }        array[size-1]=null;//把最后一个元素置空        size--;        //缩容        if (size==array.length/2){            resize(array.length/2);        }        return e2;    }    //删除开头    public E removeFirst() throws  Exception{        return remove(0);    }    //删除结尾    public E removeLast() throws  Exception{        return remove(size-1);    }    //查找指定位置的元素    public E get(int index) throws  Exception{        if(index<0 || index>=size){            throw new ArrayIndexOutOfBoundsException("索引越界"+index);        }        return array[index];    }    //判断是否包含某个元素    public int cantains(E e){        int index=-1;        for (int i=0;i<size;i++){            if (array[i].equals(e)){                index=i;                break;            }        }        return index;    }    //删除指定元素    public void remove(E e) throws Exception {        int i=cantains(e);        if (i>-1){            remove(i);        }    }    //获取数组容量    public int getCapacity(){        return array.length;    }    //获取数组长度    public int getSize() {        return size;    }    //修改指定位置的元素    public void set(int index,E e) throws Exception{        if(index<0 || index>=size){            throw new ArrayIndexOutOfBoundsException("索引越界"+index);        }        array[index]=e;    }    @Override    public String toString() {        StringBuffer s=new StringBuffer("[");        for (int i=0;i<size;i++){            s.append(array[i]);            if (i!=size-1){                s.append(", ");            }        }        s.append("]");        return s.toString();    }}