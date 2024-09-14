package Data_Structures.BinaryTree;


    class Node5 {
        int data;
        Node5 left, right;

        // Constructor
        Node5(int item) {
            data = item;
            left = right = null;
        }
    }

    public class CountNodes {
        static int countNodes(Node5 root) {
            if (root == null) return 0;

            countNodes(root.left);
            countNodes(root.right);
            return countNodes(root.left )+ countNodes(root.right) + 1;
        }

        public static void main(String[] args) {
            // Create the following binary tree
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5

            Node5 root = new Node5(1);
            root.left = new Node5(2);
            root.right = new Node5(3);
            root.left.left = new Node5(4);
            root.left.right = new Node5(5);

            int N = countNodes(root);
            System.out.println("The No of Nodes are : "+ N);
        }

    }


