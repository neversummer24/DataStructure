package com.example.datastructure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBuilder {
    public static TreeNode buildBinaryTree(Integer[] nodes) {
        if (nodes == null || nodes.length == 0 || nodes[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < nodes.length) {
            TreeNode current = queue.poll();

            // Process left child
            if (index < nodes.length && nodes[index] != null) {
                current.left = new TreeNode(nodes[index]);
                queue.offer(current.left);
            }
            index++;

            // Process right child
            if (index < nodes.length && nodes[index] != null) {
                current.right = new TreeNode(nodes[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    // Helper method to print tree (in-order traversal)
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        // Example usage:
        Integer[] treeData = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = buildBinaryTree(treeData);

        System.out.println("In-order traversal of the built tree:");
        printTree(root);
    }
}
