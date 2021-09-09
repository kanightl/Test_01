package com.neuedu.work.day0825;


import java.util.Stack;

public class Test_非递归遍历数_中序 {
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
        midOrder(tree[0]);//7 3 8 1 9 4 0 5 2 6


    }

    public static void midOrder(TreeNode node) {
        //创建栈，保存根节点
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            //当栈非空是，节点出栈，并取该节点的右子节点，重新遍历
            if (!stack.isEmpty()) {
                TreeNode n2 = stack.pop();
                System.out.print(n2.value + " ");
                node = n2.right;
            }

        }

    }
}
