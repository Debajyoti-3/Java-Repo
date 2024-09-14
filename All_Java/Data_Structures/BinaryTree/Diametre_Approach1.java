// O(N^2) Complexity

package Data_Structures.BinaryTree;

 class Node8{
        int data;
        Node8 left, right;

        // Constructor
  Node8(int item) {
            data = item;
            left = right = null;
        }
    }
    public class Diametre_Approach1 {
        static int height(Node root) {
            if (root == null) return 0;
            height(root.left);
            height(root.right);
            int heightY = Math.max(height(root.left), height(root.right)) +1;
            return heightY;
        }
        static int diameter(Node root) {
            if (root == null) return 0;
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) +1;

            return Math.max(diam3, Math.max(diam1,diam2));
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


            int h = diameter(root);
            System.out.println("Diameter is: "+ h);
        }

    }




