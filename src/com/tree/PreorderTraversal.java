package com.tree;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PreorderTraversal {

//      Definition for a binary tree node.
      public class TreeNode {
          int val;
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

        private List<Integer> output = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            if(root == null)
                return Collections.emptyList();
            output.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return output;
        }
}
