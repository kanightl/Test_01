package com.neuedu.work.day0825;

import com.neuedu.work.TEST.Test02;

public class Test_递归遍历数_先序 {
    public static void main(String[] args) {
        //初始化完全二叉树
        TreeNode[] tree=new TreeNode[10];
        for (int i=0;i<tree.length;i++){
            tree[i]=new TreeNode(i);
        }
        for (int i=0;i<tree.length;i++){
            //如果第i个节点有子节点，则关联其子节点
            if (i*2+1<tree.length){
                tree[i].left=tree[i*2+1];
            }
            if (i*2+2<tree.length){
                tree[i].right=tree[i*2+2];
            }
        }
        int j=3;
        System.out.println("节点，"+tree[j].value+",左"+tree[j].left.value+",右"+tree[j].right.value);

    //先序遍历
    preOrder(tree[0]);//0 1 3 7 8 4 9 2 5 6



    }

    public static void preOrder(TreeNode node){
        System.out.print(node.value+" ");
        TreeNode left=node.left;
        if (left!=null){
            preOrder(left);
        }
        TreeNode right=node.right;
        if (right!=null){
            preOrder(right);
        }

    }
}
