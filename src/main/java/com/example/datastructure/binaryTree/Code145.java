package com.example.datastructure.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.example.datastructure.binaryTree.BinaryTreeBuilder.buildBinaryTree;

public class Code145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode prev = null;
        if(root == null){
            return res;
        }


        while(!stack.isEmpty() || root != null ){
            while(root!=null){ //当前节点一直压到最左
                stack.push(root);
                root = root.left;
            }

            TreeNode top = stack.peek(); //栈顶元素

            if(top.right !=null && top.right != prev){
                root = top.right;  // root指向右child节点
            }else{
                stack.pop();
                res.add(top.val);
                prev = top;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] treeData = {1,null,2,3};
        TreeNode root = buildBinaryTree(treeData);

        Code145 code145 = new Code145();
        List<Integer> res = code145.postorderTraversal(root);


    }
}
