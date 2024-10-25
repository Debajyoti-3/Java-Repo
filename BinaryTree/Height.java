package Data_Structures.BinaryTree;
import java.util.*;

    class Node7{
        int data;
        Node7 left, right;

        // Constructor
        Node7(int item) {
            data = item;
            left = right = null;
        }
    }

    public class Height {
        static int height(Node root) {
            if (root == null) return 0;
            height(root.left);
            height(root.right);
            int heightY = Math.max(height(root.left), height(root.right)) +1;
            return heightY;

        }

        public static void main(String[] args) {
            // Create the following binary tree
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);


            int h = height(root);
            System.out.println("Height is: "+ h);
        }

    }


