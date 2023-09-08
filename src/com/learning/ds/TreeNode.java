package com.learning.ds;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        left = right = null;
    }

    public String toString() {
        return "" + value;
    }
}
