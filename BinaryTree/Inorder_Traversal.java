package Data_Structures.BinaryTree;
   class Node4{
        int data;
        Node4 left, right;

        // Constructor
        Node4(int item) {
            data = item;
            left = right = null;
        }
    }

    public class Inorder_Traversal {
        static void inOrderTraversal(Node4 root) {
            if (root == null) return;

            // Traverse the left subtree
            inOrderTraversal(root.left);

            // Visit the root node
            System.out.print(root.data + " ");

            // Traverse the right subtree
            inOrderTraversal(root.right);
        }

        public static void main(String[] args) {
            // Create the following binary tree
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5

            Node4 root = new Node4(1);
            root.left = new Node4(2);
            root.right = new Node4(3);
            root.left.left = new Node4(4);
            root.left.right = new Node4(5);

            System.out.print("In-Order Traversal: ");
            inOrderTraversal(root);
            System.out.println();
        }

    }


