package Data_Structures.BinaryTree.BST;

// GFG : There is BST given with the root node with the key part as an integer only.
// You need to find the in-order successor and predecessor of a given key.
// If either predecessor or successor is not found, then set it to NULL.

public class Predecessor_Successor {
        class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data= data;
                left = null;
                right = null;
            }
        }

        public static Node suc(Node root, Node[] suc, int key){
            if(root == null){
                return null;
            }
            Node bye = null;
            while(root != null){
                if(key >= root.data){
                    root = root.right;
                }
                else{
                    bye = root;
                    root = root.left;
                }

            }
            return bye;
        }
        public static Node pred(Node root, Node[] pre, int key){
            if(root == null){
                return null;
            }
            Node hello = null;
            while(root != null){
                if(key <= root.data){
                    root = root.left;
                }
                else{
                    hello = root;
                    root = root.right;
                }

            }
            return hello;
        }

        public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
            // code here.
            // update pre[0] with the predecessor of the key
            // update suc[0] with the successor of the key

            pre[0]=pred(root,pre,key);
            suc[0]=suc(root,suc,key);

        }
    }

