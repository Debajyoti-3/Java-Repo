package Data_Structures.BinaryTree.BST;
import java.util.* ;
import java.io.*;

public class ceil_BST {



     // Following is the TreeNode class structure

     class TreeNode<T>
     {
     //public:
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     TreeNode(T data)
     {
     this.data = data;
     left = null;
     right = null;
     }
     };



    public class Solution {

        public  static int findCeil(TreeNode<Integer> node, int x) {

            // Write your code here
            int ceil = -1;
            while(node != null){
                if(node.data == x){
                    ceil = node.data;
                    return ceil;
                }
                else if(x < node.data){
                    ceil = node.data;
                    node = node.left;
                }
                else{
                    node = node.right;
                }
            }
            return ceil;

        }
    }

}
