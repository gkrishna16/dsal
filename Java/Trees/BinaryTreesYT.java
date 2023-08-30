import java.util.*;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNodes = new Node(nodes[idx]);
            newNodes.left = buildTree(nodes);
            newNodes.right = buildTree(nodes);
            return newNodes;
        }

        public void preorder(Node root) {
            // root --> left --> right
            if (root == null)
                return;

            System.out.print(root.data + "   ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + "   ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "   ");

        }

    }

    // Left subtree --> root --> right subtree

    // Level order traversal
    // FIFO - first in first out. --> Queue
    // LIFO - last in first out. --> Stack

    // level order traversal
    public static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return;
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int SumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = SumNodes(root.left);
        int rightNode = SumNodes(root.right);

        return leftNode + rightNode + root.data;

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        LevelOrder(root);
        int count = countOfNodes(root);
        System.out.println("There are " + count + " nodes.");
        int sum = SumNodes(root);
        System.out.println("The sum is " + sum + ".");

        //System.out.println("This is root of tree --> " + root.data);
        //tree.preorder(root);
        //System.out.println();
        //tree.inorder(root);
        //System.out.println();
        //tree.postorder(root);
        //System.out.println();
    }
}