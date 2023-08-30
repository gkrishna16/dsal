public class LinkedList1 {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
            // this.size = 0;
        }
    }

    Node head, tail;
    int size = 0;

    void insertFirst(int d) {
        Node node = new Node(d);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void insertLast(int d) {
        if (head == null) {
            insertFirst(d);
            return;
        }

        Node node = new Node(d);
        tail.next = node;
        tail = node;
        size++;
    }

    void PrintAll() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.insertFirst(0);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertLast(10);
        System.out.println("size " + ll.size);
        ll.PrintAll();
    }
}
