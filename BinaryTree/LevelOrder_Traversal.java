package Data_Structures.BinaryTree;
import java.util.*;

import java.util.LinkedList;

public class LevelOrder_Traversal {
    static class Node1{
        int data;
        Node1 left, right;
        Node1(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static void levelOrder(Node1 root) {
        if (root == null) {
            return;
        }
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node1 currNode = q.remove();
            if (currNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
            
        public static void main(String[] args) {
        Node1 root = new Node1( 1);
         root.left = new Node1(2);
         root.right = new Node1(3);
         root.left.left = new Node1(7);
         root.right.right = new Node1(5);

         levelOrder(root);

    }
 }
