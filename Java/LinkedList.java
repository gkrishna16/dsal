class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T> {
    Node head;

    public <T> void Prepend(T d) {
        if (head == null) {
            head = new Node<T>(d);
            return;
        }
        Node<T> newNode = new Node<T>(d);
        newNode.next = head;
        head = newNode;
        return;

    }

    public <T> void Append(T d) {
        if (head == null) {
            head = new Node<T>(d);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(d);

    }

    public <T> void deleteWithValue(T data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void DeleteAtHead() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        head = head.next;
    }

    public <T> void SearchItem(T d) {
        if (head == null) {
            System.out.println("The linkedlist is empty.");
            System.out.println("False");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == d) {
                System.out.println("True");
                return;
            }
            current = current.next;
        }
        System.out.println("False");
    }

    public <T> void PrintAll() {
        if (isEmpty()) {
            System.out.println("There are no elements in the linkedlist.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();

    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.Append(10);
        ll.Prepend(20);
        ll.PrintAll();
        ll.Prepend(30);
        ll.PrintAll();
        ll.Append(40);
        ll.PrintAll();
        ll.deleteWithValue(40);
        ll.PrintAll();
        ll.SearchItem(206);

    }
}
