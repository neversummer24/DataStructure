package com.example.datastructure.binaryTree;

public class Code1448 {
        public static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }

        }
            public int goodNodes(TreeNode root) {
                if(root == null) return 0;
                return dfs(root,root.val);
            }

            public int dfs(TreeNode root,int max) {
                if(root == null) return 0;
                if(root.val >= max){
                    return 1 + dfs(root.left,root.val) + dfs(root.right,root.val);
                }else{
                    return dfs(root.left,max) + dfs(root.right,max);
                }
            }
 }
