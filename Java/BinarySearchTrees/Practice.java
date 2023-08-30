public class Practice {
    static class Node {
        int key;
        Node left, right;

    }

    static Node newNode(int item) {
        Node temp = new Node();
        temp.key = item;
        temp.left = temp.right = null;

        return temp;

    }

    public static Node insert(Node root, int key) {

        if (root == null) {
            return newNode(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;

    }

    static int nodeCount(Node root) {
        if (root == null) {
            return 0;

        }

        return nodeCount(root.left) + nodeCount(root.right) + 1;
    }

    public static void main(String args[]) {
        Node root = null;

        // inserting value 50
        root = insert(root, 50);

        // inserting value 30
        insert(root, 30);

        // inserting value 20
        insert(root, 20);

        // inserting value 40
        insert(root, 40);

        // inserting value 70
        insert(root, 70);

        // inserting value 60
        insert(root, 60);

        // inserting value 80
        insert(root, 80);

        // print the BST
        System.out.print(" " + nodeCount(root));
        System.out.println();
    }
}
