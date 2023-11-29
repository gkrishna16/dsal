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
    void armStrongNum(int n)
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
            sumofPower = pow(lastDigit, count);
            n /= 10;
        }
        return (sumofPower == originalno);
    }
};

int main()
{
    Solution sol;
    int n = 121;
    cout << "Number of digits in " << n << " is " << sol.reverse(n) << ".";
    cout << endl;
}