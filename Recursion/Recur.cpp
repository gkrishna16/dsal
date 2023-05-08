#include <iostream>
using namespace std;

int Factorial(int n)
{
    if (n ==0)
    {
        return 1;
    };

    return n * Factorial(n - 1);
}

int main ()
{

    int fac = Factorial(4);
    cout << fac << endl;

    return 0;
}