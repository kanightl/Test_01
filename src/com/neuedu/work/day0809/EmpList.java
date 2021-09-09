package com.neuedu.work.day0809;

//雇员链表类,存储id值在某个范围内的雇员
public class EmpList {
    private  Emp head;//头指针


    //向链表中增加雇员，假设id是自增生成的，新雇员加到结尾即可
    public void add(Emp e){
        if (head==null){
            //head如果是null，则head指向当前新增雇员即可
            head=e;
            return;

        }
        Emp temp=head;//创建临时指针，用于向后遍历
        while (true){
            if (temp.next==null){
               break;
            }
            temp=temp.next;
        }
        temp.next=e;
    }

//    遍历链表中的雇员信息
    public void list(int no){
        if (head==null){
            System.out.println("第"+(no+1)+"个链表为空");
            return;
        }
        System.out.println("第"+(no+1)+"个链表信息为：");
        Emp temp=head;
        while (true){
            System.out.printf("\t=>id=%d,name=%s\n",temp.id,temp.name);
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        System.out.println();
    }

    //根据id查找雇员，找不到返回null
    public Emp findById(int id){
        if (head==null){
            System.out.println("链表为空");
            return null;
        }
        Emp temp=head;
        while (true){
            if (temp.id==id){
                break;
            }
            if (temp.next==null){
                temp=null;
                break;
            }
            temp=temp.next;

        }
        return temp;
    }

}
