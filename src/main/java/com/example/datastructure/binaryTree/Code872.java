package com.example.datastructure.binaryTree;

import java.util.ArrayList;
import java.util.List;


public class Code872 {


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
