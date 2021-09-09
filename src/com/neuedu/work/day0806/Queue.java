package com.neuedu.work.day0806;

public interface Queue<T> {
    //返回队列长度
    int size();

    //判断队列是否为空
    boolean isEmpty();

    //入队，可扩容
    boolean add(T date);

    //元素加入队列，如果元素为空，则抛空指针异常,如果固定容量，可能会增加失败
    boolean offer(T date);

    //返回队头元素，不删除，如果为空，返回null
    T peek();

    //返回队头元素，不删除，如果队列为空，则抛出NoSuchElementException
    T element();

    //返回队头元素，并删除，如果为空，返回null
    T poll();

    //返回队头元素，并删除,如果队列为空，则抛出NoSuchElementException
    T remove();

    //清空队列
    void clearQueue();

}
