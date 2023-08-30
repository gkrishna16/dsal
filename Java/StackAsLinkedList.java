public class StackAsLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void Push(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            System.out.println("Linkedlist is empty.");
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }

    }

    int Pop() {
        int popped = head.data;
        if (head == null) {
            System.out.println("The linked list is empty.");
            return Integer.MIN_VALUE;
        } else {
            head = head.next;
            System.out.println("The popped element is " + popped + ".");
            return popped;
        }
    }

    void Peek() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.println("The peek element is " + head.data + ".");
    }

    void Print() {
        if (head == null) {
            System.out.println("The linkedlist is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackAsLinkedList st = new StackAsLinkedList();
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Print();
        st.Pop();
        st.Peek();
        st.Print();
    }

}