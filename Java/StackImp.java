class StackImp {
    int nums[];
    int top = -1;
    int MAX;

    StackImp(int capacity) {
        MAX = capacity;
        this.nums = new int[capacity];
    }

    // Peek, Push, Pop
    void Push(int d) {
        nums[++top] = d;
    }

    int Pop() {
        int n = nums[top--];
        return n;
    }

    int Peek() {
        return nums[top];
    }

    void Print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {
        StackImp st = new StackImp(5);
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Print();
        st.Pop();
        st.Print();
        // System.out.println(st.Peek());
    }
}