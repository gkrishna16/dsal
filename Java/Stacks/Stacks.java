public class Stacks {
    static final int MAX = 100;
    int arr[] = new int[MAX];
    int top;

    Stacks() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top > (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        arr[++top] = x;
        System.out.println(x + "Pu shed into the stack.");
        return true;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }

        int temp = arr[top--];
        return temp;
       

    }

    public static void main(String args[]) {
    }
}