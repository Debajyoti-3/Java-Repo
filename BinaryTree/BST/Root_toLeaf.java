package Data_Structures.BinaryTree.BST;

import java.util.ArrayList;

public class Root_toLeaf {
    
        static class Node{
            Node left;
            Node right ;
            int data;

            Node(int data){
                this.data = data;
            }
        }
        public static void printPath(ArrayList<Integer> path){
            for (int i=0; i<path.size(); i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println();
        }
        public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
            if(root == null){
                return;
            }
            path.add(root.data);

            if(root.left == null && root.right == null){
                printPath(path);
            }
            else{
                printRoot2Leaf(root.left, path);
                printRoot2Leaf(root.right, path);
            }
            path.remove(path.size()-1);
        }

        public static Node insert(Node root, int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            if(root.data > data){
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
            return root;
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void main(String[] args) {
            int[] values = {8,5,3,1,4,6,10,11,14};
            Node root = null;
            for(int i =0; i<values.length; i++){
                root = insert(root, values[i]);
            }
            inorder(root);
            System.out.println();
            printRoot2Leaf(root, new ArrayList<>());
        }
    }



