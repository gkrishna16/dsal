public class Queue {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from the head
    private Node tail; // add from the tail

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;

        // if (tail != null) {
        // tail.next = node;
        // }
        // tail = node;

        // if (head == null) {
        // head = node;
        // }
    }

    public int remove() {
        int dat = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println("The removed one is " + dat);
        return dat;
    }

    void PrintAll() {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.PrintAll();
        q.remove();
        q.PrintAll();

    }
}