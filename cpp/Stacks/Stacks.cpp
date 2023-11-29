#include <iostream>
#include <vector>vsvfs
#include <stack>
using namespace std;

const int MAX = 100;

class Stack
{
private:
    int max = 100;

public:
    int MAX = 100;
    int top;
    int a[MAX]; // Maximum size of Stack

    Stack()
    {
        top = -1;
    }

    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack ::push(int x)
{
    if (top >= (MAX - 1))
    {
        cout << "Stack Overflow";
        return false;
    }
    else
    {
        int x = a[top--];
        return x;
    }
}

int main()
{

    cout << endl;
}