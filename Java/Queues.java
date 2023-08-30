//class Queues {
//    int[] queue;
//    int rear;
//    int front;
//    int capacity;

//    Queues(int cap) {
//        this.capacity = cap;
//        this.queue = new int[cap];
//        this.rear = 0;
//        this.front = 0;

//    }

//    void queueEnqueue(int data) {
//        if (capacity == rear) {
//            System.out.println("\nQueue is full \n");
//            return;
//        }

//        // Insert element in the rear
//        else {
//            queue[rear++] = data;
//        }
//    }

//    int queueDequeue() {
//        int fr;
//        if (rear == 0) {
//            System.out.println("The queue is empty");
//            return -1;
//        } else {
//            fr = queue[front];
//            // Shift all the emements from index 2
//            for (int i = 0; i < rear - 1; i++) {
//                queue[i] = queue[i + 1];
//            }
//            // decrement rear
//            rear--;
//        }
//        System.out.println(fr);
//        return fr;

//    };

//    boolean isEmpty() {
//        if (rear == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    void PrintAll() {
//        if (isEmpty()) {
//            return;
//        } else {
//            for (int i = 0; i < rear; i++) {
//                System.out.print(queue[i] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String args[]) {
//        Queues q = new Queues(3);
//        q.queueEnqueue(10);
//        q.queueEnqueue(20);
//        q.queueEnqueue(30);
//        q.PrintAll();
//        q.queueDequeue();
//        q.PrintAll();
//        System.out.println(q.isEmpty());
//    }

//}

class Queues {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    void queueEnqueue(int d) {
        if (head == null) {
            head = new Node(d);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new Node(d);
    }

    int queueDequeue() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return -1;
        }
        ;
        int curr = head.data;
        head = head.next;
        System.out.println(curr);
        return curr;

    }

    void PrintAll() {
        if (head == null) {
            return;
        } else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Queues q = new Queues();
        q.queueEnqueue(10);
        q.queueEnqueue(20);
        q.PrintAll();
        q.queueDequeue();
        q.PrintAll();
    }

}