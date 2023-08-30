import java.util.*;

class Practice {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void Inorder(Node root) {
            if (root == null) {
                return;
            }

            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            return Math.max(height(root.left), height(root.right)) + 1;
        }

        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));

        }

        public TreeInfo diameter2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiam = Math.max(Math.max(diam1, diam2), diam3);

            TreeInfo resultNode = new TreeInfo(myHeight, myDiam);

            return resultNode;
        }

        // subtree of the bigger tree

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.right.data);
        System.out.println("The height of tree is " + tree.height(root) + ".");
        System.out.println("The diameter of the tree is " + tree.diameter(root) + ".");
        // tree.inorder(root);
        // System.out.println();
        System.out.println("The diameter of the tree is " + tree.diameter2(root).diam + ".");
        tree.Inorder(root);
        System.out.println();
    }
}
