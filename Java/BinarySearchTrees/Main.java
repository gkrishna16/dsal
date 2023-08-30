import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };

        for (int i : nums) {
            System.out.println(i);
        }
    }

}
