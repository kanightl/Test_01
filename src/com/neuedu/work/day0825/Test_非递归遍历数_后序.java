package com.neuedu.work.day0825;


import java.util.Stack;

public class Test_非递归遍历数_后序 {
    public static void main(String[] args) {
        //初始化完全二叉树
        TreeNode[] tree = new TreeNode[10];
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new TreeNode(i);
        }
        for (int i = 0; i < tree.length; i++) {
            //如果第i个节点有子节点，则关联其子节点
            if (i * 2 + 1 < tree.length) {
                tree[i].left = tree[i * 2 + 1];
            }
            if (i * 2 + 2 < tree.length) {
                tree[i].right = tree[i * 2 + 2];
            }
        }


        //先序遍历
        postOrder(tree[0]);//7 3 8 1 9 4 0 5 2 6


    }

    public static void postOrder(TreeNode node) {
        //创建left和righ变量，分别用于辅助栈中纪录输的节点类型
         int left=1;//表示左子树节点
         int right=2;//右子树节点

        //创建纪录树节点的栈
        Stack<TreeNode> s=new Stack<>();

        //创建辅助栈纪录节点类型
        Stack<Integer> s2 =new Stack<>();

        while (node!=null || !s.isEmpty()){
            //先遍历左子节点到头
            while (node!=null){
                s.push(node);
                s2.push(left);
                node=node.left;
            }

            //再取辅助栈的节点类型，如果是右子节点，则树节点栈出栈
            while (!s.isEmpty() && s2.peek()==right){
                s2.pop();
                System.out.print(s.pop().value +" ");
            }

            //取辅助栈的节点类型，如果是左子节点类型，则取其右子节点
            if (!s.isEmpty() && s2.peek()==left){
                s2.pop();
                s2.push(right);
                node=s.peek().right;
            }
        }
    }
}
