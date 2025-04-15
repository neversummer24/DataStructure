package com.example.datastructure.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code872 {
    public static class TreeNode { int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return getLeaves(root1).equals(getLeaves(root2));
    }


    public List<Integer> getLeaves(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root,result);
        return result;
    }

    public void traverse(TreeNode root,List<Integer> result) {
        if (root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            result.add(root.val);
        }else {
            // 前序位置
            traverse(root.left,result);
            // 中序位置
            traverse(root.right,result);
            // 后序位置
        }

    }


}
