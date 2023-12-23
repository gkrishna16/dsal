#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int count_digits(int n)
    {
        int x = n;
        int count = 0;
        while (x != 0)
        {
            x = x / 10;
            count++;
        }
        return count;
    }

    bool reverse(int n)
    {
        int N = n;
        int reverse = 0;

        while (N != 0)
        {
            reverse = reverse * 10 + N % 10;
            N = N / 10;
        }
        return reverse == n;
    }

    int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    bool armStrongNum(int n)
    {
        int originalno = n;
        int count = 0;
        int temp = n;
        while (temp != 0)
        {
            count++;
            temp /= 10;
        }
        int sumofPower = 0;
        while (n != 0)
        {
            int lastDigit = n % 10;
            sumofPower += pow(lastDigit, count);
            n /= 10;
        }
        return (sumofPower == originalno);
    }

    void printDivisorsBruteForce(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                cout << i << " ";
            }
        }
    }

    void printDivisorOptimal(int n)
    {
        for (int i = 1; i <= sqrt(n); i++)
        {
            if (n % i == 0)
            {
                cout << i << " ";
                if (n / i != i)
                    cout << (n / i) << " ";
            }
        }
    }

    void GCDbrute(int n1, int n2)
    {
        int ans;
        for (int i = 1; i <= min(n1, n2); i++)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                ans = i;
            }
        }

        cout << "The GCD of the two numbers is " << ans;
    }

    int GCD(int n1, int n2)
    {
        if (n2 == 0)
        {
            return n1;
        }
        return GCD(n1, n1 % n2);
    }

    void recur(int n)
    {
        if (n <= 0)
        {
            return;
        }
        cout << n << endl;
        cout << "_____________" << endl;

        recur(n - 1);
        cout << n << endl;
    }

    int fib(int N)
    {
        // base condition
        if (N <= 1)
        {
            return N;
        }

        int last = fib(N - 1);
        int first = fib(N - 2);
        return last + first;
    }

    int factorial(int n)
    {
        cout << "I am calculating F(" << n << ")\n";
        if (n == 0)
            return 1;

        int F = n * factorial(n - 1);
        cout << "Done ! F(" << n << ") = " << F << "\n";
        return F;
    }
};

int main()
{

    Solution sol;
    // sol.recur(4);.3
    int nums[5];
    int fibn = sol.fib(4);
    sol.factorial(5);
    // cout << fibn << endl;
    //  int n = 36;
    //  sol.printDivisorOptimal(n);
    //  cout << endl;
    return 1;
}
