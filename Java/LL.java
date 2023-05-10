public class LL {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void Print() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    int getSize() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return 0;
        }
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    void insertAt(int position, int value) {

        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if (position < 0 || position > this.getSize() + 1) {
            System.out.println("the position is invalid");
            return;
        }
        if (position == 0) {
            this.prepend(value);
            return;
        }
        if (position == this.getSize() + 1) {
            this.append(value);
            return;
        }

        // iterate until you reach the point
        int it = 0;
        Node curr = head;
        Node prev = null;
        Node newNode = new Node(value);
        while (it < position) {
            it++;
            prev = curr;
            curr = curr.next;
        }

        prev.next = newNode;
        newNode.next = curr;

    }

    void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        System.out.println("The main function.");

        LL ll = new LL();
        ll.append(100);
        ll.append(200);
        ll.append(300);
        ll.Print();
        ll.insertAt(0, 40);
        System.out.println("Afer insertAt function.");
        ll.Print();
        ll.insertAt(5, 3);
        ll.Print();
        System.out.println(ll.getSize());
    }
}



