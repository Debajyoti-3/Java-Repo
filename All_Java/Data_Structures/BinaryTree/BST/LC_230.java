package Data_Structures.BinaryTree.BST;
import java.util.*;

public class LC_230 {

      // Definition for a binary tree node.
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

    class Solution {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        public ArrayList inOrder(TreeNode root){
            if(root == null){
                return list;
            }
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);

            return list;
        }
        public int kthSmallest(TreeNode root, int k) {
            arr = inOrder(root);
            return arr.get(k-1);

        }
    }
}
