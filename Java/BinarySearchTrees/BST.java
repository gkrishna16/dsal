public class BST {
    static class Node {
        int val;
        Node left;
        Node right;
    }

    static Node newNode(int item) {
        Node temp = new Node();
        temp.val = item;
        temp.right = temp.left = null;

        return temp;
    }

    // Function to insert a new node with
    // given key in BST

    public static Node insert(Node root, int val) {
        if (root == null) {
            return newNode(val);
        }
        if (val > root.val) {
            root.right = insert(root.right, val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        ;
        // Recur the node
        return root;

    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(" " + root.val);
            inorder(root.right);
        }
    }

    static Node minValNode(Node node) {
        Node current = node;

        while (current != null && current.left != null) {
            current = current.right;
        }

        return current;
    }

    static Node deleteNode(Node root, int key) {
        // base case
        if (root == null) {
            return root;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        else if (key > root.val) {
            root.right = deleteNode(root.right, key);

        }

        else {

            if (root.left == null) {
                Node temp = root.right;
                return temp;
            } else if (root.right == null) {
                Node temp = root.left;
                return temp;
            }

            Node temp = minValNode(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }

        return root;

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
        inorder(root);
    }
}