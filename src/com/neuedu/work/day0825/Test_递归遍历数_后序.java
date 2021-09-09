package com.neuedu.work.day0825;

public class Test_递归遍历数_后序 {
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


    //中序遍历
    postOrder(tree[0]);//7 3 8 1 9 4 0 5 2 6



    }

    public static void postOrder(TreeNode node){
           if (node==null){
               return;
           }else {
               postOrder(node.left);
               postOrder(node.right);
               System.out.print(node.value+" ");

           }


    }
}
