import java.util.*;

class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        int left;
        int right;

        public Node(int value) {
            this.value = value;
        }
    }}

    private Node root;

    // insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value to the left of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
    }


