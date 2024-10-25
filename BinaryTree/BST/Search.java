package Data_Structures.BinaryTree.BST;


public class Search {
        static class Node{
            Node left;
            Node right ;
            int data;

            Node(int data){
                this.data = data;
            }
        }

//        Inserting Nodes in BST
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

//            Inorder Traversal
        public static void inorder( Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

//        Searching Algorithm
        public static boolean search(Node root, int key){
            if(root == null){
                return false;
            }
             if(root.data == key){
                return true;
            }
            else if(root.data > key){
                return search(root.left, key);
            }
            else{
                return search(root.right, key);
            }

        }

        public static void main(String[] args) {
            int[] values = {5,1,3,4,2,7};
           Node root = null;
            for(int i =0; i<values.length; i++){
                root = insert(root, values[i]);
            }
            inorder(root);
            System.out.println();
            int key = 3;
            if(search(root,key)){
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }
        }
    }



