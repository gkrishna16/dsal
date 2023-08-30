import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }

    }

    public void insertLast(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        ;
        current.next = newNode;

    }

    public void PrintAll() {
        if (head == null) {
            System.out.println("The linkedlist is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    };

    public void DeleteNode(int ndVal) {
        if (head == null) {
            System.out.println("The linkedlist is empty.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == ndVal) {
                current.next = current.next.next;
            }
            current = current.next;
        }

    }

    void deleteNode(int key) {
        // Store the head node
        Node temp = head,
                prev = null;

        while (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        ;

        // if the key was not found in the linkedlist
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    void deleteAtPosition(int position) {
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = head.next;
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1;) {
            temp = temp.next;
        }

        // if position is more than number of nodes
        Node next = temp.next.next;
        temp.next = next;
    }

    public static void main(String[] args) {
        DLinkedList ll = new DLinkedList();
        ll.insertLast(100);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(40);
        ll.PrintAll();
        ll.DeleteNode(20);
        ll.PrintAll();
        ll.deleteAtPosition(1);
        ll.PrintAll();

    }
}