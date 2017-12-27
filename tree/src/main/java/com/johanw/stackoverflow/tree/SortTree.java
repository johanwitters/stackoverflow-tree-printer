package com.johanw.stackoverflow.tree;

public class SortTree {

    static Node root;

    Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.setLeft(sortedArrayToBST(arr, start, mid - 1));
        node.setRight(sortedArrayToBST(arr, mid + 1, end));
        return node;
    }

    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }


}