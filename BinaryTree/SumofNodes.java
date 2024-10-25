package Data_Structures.BinaryTree;


    class Node6 {
        int data;
        Node6 left, right;

        // Constructor
        Node6(int item) {
            data = item;
            left = right = null;
        }
    }

    public class SumofNodes {
        static int sumOfNodes(Node6 root) {
            if (root == null) return 0;
            int leftsum = sumOfNodes(root.left);

            int rightsum = sumOfNodes(root.right);
            return leftsum + rightsum + root.data;
        }

        public static void main(String[] args) {
            // Create the following binary tree
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5

            Node6 root = new Node6(1);
            root.left = new Node6(2);
            root.right = new Node6(3);
            root.left.left = new Node6(4);
            root.left.right = new Node6(5);


            int y = sumOfNodes(root);
            System.out.println("Sum of all Nodes: "+y);
        }

    }


