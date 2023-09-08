package com.learning.ds;

public class BinaryTree<T> {
    public TreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    /*
                                            8
                                  /                 \
                                /                     \
                            4                           11
                          /    \                     /       \
                       2         6               9               13
                      /  \     /   \              \            /    \
                    1     3   5      7               10      12      14
     */
    public static TreeNode create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(8);
        tree.root = root;


        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(3);

        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(7);

        root.right = new TreeNode(11);
        root.right.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);

        root.right.right = new TreeNode(13);
        root.right.right.left = new TreeNode(12);
        root.right.right.right = new TreeNode(14);


        return root;
    }
}
