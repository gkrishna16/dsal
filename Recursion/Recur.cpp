#include <iostream>
using namespace std;

int Factorial(int n)
{
    if (n == 0)
    {
        return 1;
    };
    return n * Factorial(n - 1);
}


int Fib(int n){
    if (n <= 1)
        return 1;

    int F = Fib(n - 1) + Fib(n - 2);
    return F;
}

int main()
{

    int fac = Factorial(4);
    cout << fac << endl;

    int F = Fib(4);
    cout << F << endl;

    return 0;
}