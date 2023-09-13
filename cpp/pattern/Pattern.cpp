#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void Pattern12(int n)
    {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                cout << j;
            }
            // spaces
            for (int space = 1; space <= spaces; space++)
            {
                cout << " ";
            }

            // numbers print
            for (int j = i; j >= 1; j--)
            {
                cout << j;
            }

            cout << endl;
            spaces -= 2;
        }
    }
    void Pattern13(int n)
    {
        int num = 1;
        // Outer loop for the number of rows.
        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= i; j++)
            {
                cout << num << " ";
                num++;
            }

            cout << endl;
        }
    };
    void Pattern14(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (char ch = 'A'; ch <= 'A' + i; ch++)
            {
                cout << ch << " ";
            }
            cout << endl;
        }
    }
    void Pattern15(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (char j = 'A'; j <= 'A' + (N - i - 1); j++)
            {
                cout << j << " ";
            }

            cout << endl;
        }
    }
    void Pattern16(int N)
    {
        for (int i = 0; i < N; i++)
        {
            char ch = 'A' + i;
            for (int j = 0; j <= i; j++)
            {
                cout << ch << " ";
            }

            cout << endl;
        }
    };
    void Pattern17(int N)
    {
        // Outer loop for the number of rows.
        for (int i = 0; i < N; i++)
        {
            // for printing the spaces
            for (int j = 0; j < N - i - 1; j++)
            {
                cout << " ";
            }

            // for printing the spaces again after charachters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++)
            {
                cout << ch;
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // for printing the spaces again after charachters
            for (int j = 0; j < N - i - 1; j++)
            {
                cout << " ";
            }
            cout << endl;
        }
    }
    void Pattern18(int N)
    {
        // outer loop
        for (int i = 0; i < N; i++)
        {
            // Print letters
            for (char ch = 'A' + N - i - 1; ch <= ('A' + N - 1); ch++)
            {
                cout << ch << " ";
            }
            cout << endl;
        }
    }
    void Pattern19(int N)
    {
        for (int i = 0; i < N; i++)
        {
            // print star
            for (int j = 1; j <= N - i; j++)
            {
                cout << "*";
            }
            // print space
            for (int k = 1; k < 2 * i + 1; k++)
            {
                cout << " ";
            }
            // print star
            for (int j = 1; j <= N - i; j++)
            {
                cout << "*";
            }
            cout << endl;
        }

        for (int l = 1; l <= N; l++)
        {
            // print star
            for (int m = 1; m <= l; m++)
            {
                cout << "*";
            }
            // print space
            for (int sp = 1; sp <= (2 * N) - (2 * l); sp++)
            {
                cout << " ";
            }
            // print star
            for (int m = 1; m <= l; m++)
            {
                cout << "*";
            }
            cout << endl;
        }
    }
    void Pattern20(int N)
    {
        for (int i = 1; i <= N; i++)
        {
            // print star
            for (int j = 1; j <= i; j++)
            {
                cout << "*";
            }
            // print space
            for (int k = 1; k <= (2 * N) - (2 * i); k++)
            {
                cout << " ";
            }
            // print star
            for (int l = 1; l <= i; l++)
            {
                cout << "*";
            }
            cout << endl;
        }

        for (int i = 1; i <= N; i++)
        {
            // print star
            for (int j = 1; j <= N - i; j++)
            {
                cout << "*";
            }
            // print space
            for (int k = 1; k <= i * 2; k++)
            {
                cout << " ";
            }
            // print star
            for (int j = 1; j <= N - i; j++)
            {
                cout << "*";
            }
            cout << endl;
        }
    }
    void Pattern21(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j == 0 || i == 0 || j == n - 1 || i == n - 1)
                {
                    cout << "*";
                }
                else
                {
                    cout << " ";
                }
            }
            cout << endl;
        }
    }
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

    int count_digits2(int n)
    {
        int digits = floor(log10(n) + 1);
        return digits;
    }

    void reverse(int n)
    {
        int reversed = 0, num = n;
        while (num != 0)
        {
            // first get the last digit
            int last = num % 10;
            reversed = reversed * 10 + last;
            num = num / 10;
        }

        cout << reversed << endl;
    }
    void pattern12(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            // print first number in the col
            for (int j = 1; j <= i; j++)
            {
                cout << j;
            }
            // print space in the middle
            for (int spc = 1; spc <= (2 * n) - (2 * i); spc++)
            {
                cout << " ";
            }

            // print last star series of the row
            for (int k = i; k >= 1; k--)
            {
                cout << k;
            }

            cout << endl;
        }
    }
};

// 123%10 = 3
// 0*10 + 3 = 3
// 123/10 = 12

// 12%10 = 2
// 3*10 + 2 = 32
// 12/10 = 1

// 1%10 = 1
// 32 * 10 + 1 = 321
// 1/10 = 0

int main()
{
    Solution sol;
    int N = 5;
    sol.pattern12(N);
    // cout << endl;

    return 1;
}