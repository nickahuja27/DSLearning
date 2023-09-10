package com.learning.ds.recursion.verma;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

public class P3_HeightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create();
        int height = findHeight(root);
        System.out.println("Height is: " + height);
    }

    private static int findHeight(TreeNode<Integer> node) {
        if(node == null)
            return 0;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
