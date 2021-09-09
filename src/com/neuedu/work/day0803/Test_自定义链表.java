package com.neuedu.work.day0803;

import java.util.List;

public class Test_自定义链表 {
    public static void main(String[] args) throws Exception {
        MyList<String> m = new MyList<>();
        m.insert(0, "a");
        m.insert(0, "b");
        m.insert(2, "c");
        m.insert(2, "d");
        m.output();



//        m.remove(0);
//        m.remove(3);

        //从头一直删
//        m.remove(0);
//        m.remove(0);
//        m.remove(0);
//        m.remove(0);
//        m.output();
        while (m.getSize()>0){
            m.remove(0);
        }
        m.output();

        //从尾部一直删
        while (m.getSize()>0){
            m.remove(m.getSize()-1);
        }
        m.output();



    }
}


//链表类
class MyList<E> {
    private Node<E> head;//头指针
    private int size;//链表的元素个数
    private Node<E> last;//尾指针


    //向指定位置插入新节点
    public void insert(int index, E data) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("链表索引越界" + index);
        }

        Node<E> newNode = new Node<>(data);
        if (size == 0) {//原来为空链表
            head = newNode;
            last = newNode;
        } else if (index == 0) {//在头部插入新节点
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<E> prev = get(index - 1);//获取指定位置的前一个节点
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //获取指定索引位置的节点
    public Node<E> get(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("链表索引越界" + index);
        }
        Node<E> temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void output() {
        Node<E> temp = head;
        if(size==0) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //更新指定索引位置的节点的数据
    public void update(int index, E e) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("链表索引越界" + index);
        }
        Node<E> temp = get(index);
        temp.data = e;
    }

    public Node<E> remove(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("链表索引越界" + index);
        }
        Node<E> temp = get(index);//取得待删除节点
        if (index==0){//头节点
            head=temp.next;
        }else if (index==size-1){//尾节点
            Node<E> prev=get(index-1);
            prev.next=null;
            last=prev;
        }else {
            Node<E> prev=get(index-1);
            prev.next=temp.next;
        }

        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }
}

//节点类
class Node<E> {
    E data;//保存的数据
    Node<E> next;//下一个节点的引用

    public Node(E data) {
        this.data = data;
    }
}