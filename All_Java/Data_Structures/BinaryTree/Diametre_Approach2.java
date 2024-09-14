// O(N) Complexity  (More Efficient)

package Data_Structures.BinaryTree;

class Node9{
        int data;
        Node9 left, right;

        // Constructor
        Node9(int item) {
            data = item;
            left = right = null;
        }
    }

    public class Diametre_Approach2 {
        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

            static TreeInfo diameter2(Node9 root) {
                if (root == null) {
                    return new TreeInfo(0, 0);
                }
                TreeInfo left = diameter2(root.left);
                TreeInfo right = diameter2(root.right);
                int myHeight = Math.max(left.ht, right.ht) + 1;
                int diam1 = left.diam;
                int diam2 = right.diam;
                int diam3 = left.ht + right.ht + 1;
                int mydiam = Math.max(Math.max(diam1, diam2), diam3);
                TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
                return myInfo;
            }


        public static void main(String[] args) {
            // Create the following binary tree
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5

            Node9 root = new Node9(1);
            root.left = new Node9(2);
            root.right = new Node9(3);
            root.left.left = new Node9(4);
            root.left.right = new Node9(5);

            System.out.println(diameter2(root).diam);
        }
}


