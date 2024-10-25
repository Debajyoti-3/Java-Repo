package Data_Structures.BinaryTree;
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Preorder_Traversal {
    static void preOrderTraversal(Node root) {
        if (root == null) return;

        // Visit the root node
        System.out.print(root.data + " ");

        // Traverse the left subtree
        preOrderTraversal(root.left);

        // Traverse the right subtree
        preOrderTraversal(root.right);
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

        System.out.print("Pre-Order Traversal: ");
        preOrderTraversal(root);
        System.out.println();
    }

}
