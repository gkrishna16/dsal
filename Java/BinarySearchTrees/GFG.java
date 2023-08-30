import java.io.*;

// Java program for Inserting a node
class GFG {
    // Given Node
    static class node {
        int key;
        node left, right;
    };

    // Function to create a new BST node
    static node newNode(int item) {
        node temp = new node();
        temp.left = null;
        temp.right = null;
        temp.key = item;

        return temp;
    }

    // Function to insert a new node with
    // given key in BST
    static node insert(node node, int key) {
        if (node == null) {
            return newNode(key);
        }

        if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            node.left = insert(node.left, key);
        }

        // return node
        return node;
    }

    // Function to do inorder traversal of BST

    static void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(" " + root.key);
            inorder(root.right);
        }
    }

    static int height(node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        int Height = Math.max(left, right) + 1;
        System.out.print(Height + " ");
        return Height;

    }

    static int diameter(node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);

        int diam3 = Math.max(diam1, diam2) + 1;

        int finalDiam = Math.max(diam3, Math.max(diam1, diam2));
        return finalDiam;

    }

    // Print nodes at a given level
    static void printGivenLevel(node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(" " + root.key);
        } else if (level > 1) { // Recursive call
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    // Function to print leaf nodes
    // from left to right
    static void printLeafNodes(node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.key + " ");
        }

        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    static void printNonLeafNode(node root) {

    }

    static void rightViewUtil(node root, int level, int max_level) {
        // Base case
        if (root == null)
            return;

        // If this is the last Node of its level
        if (max_level < level) {
            System.out.print(root.key + " ");
            max_level = level;
        }

        // Recur for right subtree
        rightViewUtil(root.right, level + 1, max_level);

    }

    static void leftViewUtil(node root, int level, int max_level) {
        if (root == null)
            return;

        if (level > max_level) {
            System.out.print(root.key + " ");
            max_level = level;
        }

        leftViewUtil(root.left, level + 1, max_level);
    }

    static void leftView(node root) {
        int max_level = 0;
        leftViewUtil(root, 1, max_level);
    }

    // Wrapper over rightViewUtil()
    static void rightView(node root) {
        int max_level = 0;
        rightViewUtil(root, 1, max_level);
    }

    static node minValueNode(node node) {
        node current = node;

        // Long down to find the leftmost leaf
        while (current != null && current.left != null) {
            current = current.left;
        }

        return current;

    }

    static node deleteNode(node root, int key) {
        // base case
        if (root == null) {
            return root;
        }

        // if the key to be deleted is smaller than the roots key than it lies in the
        // left left subtree

        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        }
        // if the key to delted is larger than the roots key than it lies in the right
        // subtree

        else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        }

        else {
            // Node with only one child or no child
            if (root.left == null) {
                node temp = root.right;
                return temp;
            } else if (root.right == null) {
                node temp = root.left;
                return temp;
            }

            // Node with two children
            // Get the inorder successor (smallest
            // in the right subtreez)
            node temp = minValueNode(root.right);

            // copy the inorder successor's
            // content to this node
            root.key = temp.key;
            // Delete the inorder successor
            root.right = deleteNode(root.right, temp.key);
        }
        return root;
    }

    static int nodeCount(node node) {
        if (node == null) {
            return 0;
        } else {
            return nodeCount(node.left) + nodeCount(node.right) + 1;

        }

    }

    static node maxValue(node node) {
        node currentNode = node;

        while (currentNode != null && currentNode.right != null) {
            currentNode = currentNode.right;
        }

        return currentNode;

    }

    // Driver Code
    public static void main(String[] args) {

        /*
         * Let us create following BST
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        node root = null;
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
        // rightView(root);
        // leftView(root);
        System.out.println();

        // print the BST
        // System.out.println("-----------------------------");
        // inorder(root);
        // System.out.println();
        // height(root);
        // System.out.println();
        // System.out.println("diam -- " + diameter(root));
        // printGivenLevel(root, 3);
        // System.out.println();
        printLeafNodes(root);
        System.out.println();
        // System.out.println();
        // System.out.println("------------------------------");
        // printNonLeafNode(root);
        // System.out.println();
    }
}
// This code is contributed by abhijitjadhav1998
