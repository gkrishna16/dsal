#include <iostream>
#include <vector>
using namespace std;

bool isPalindrome(int i, string &s)
{
    if (i > s.length() / 2)
    {
        return true;
    }

    if (s[i] != s[s.length() - 1 - i])
        return false;
    return isPalindrome(i + 1, s);
}

void recursiveBubbleSort(int arr[], int n)
{
    if (n == 1)
        return;

    int didSwap = 0;
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] > arr[i + 1])
        {
            int temp = arr[i];
        }
    }
    if (didSwap == 0)
        return;
    // Range reduced after recursion
    recursiveBubbleSort(arr, n - 1);
}

void reverseArray(int arr[], int start, int end)
{
    if (start > end)
    {
        return;
    }
    swap(arr[start], arr[end]);
    reverseArray(arr, start + 1, end - 1);
}

int fib(int n)
{
    if (n <= 1)
        return n;

    return fib(n - 1) + fib(n - 2);
}

int main()
{

    // Example string.

    // int N = 4;
    // cout << fib(4) << endl;
    //  string s = "madam";
    //  cout << isPalindrome(0, s);
    //  cout << endl;

    // int nums[] = {1, 2, 3, 4, 5};
    // reverseArray(nums, 0, sizeof(nums) / sizeof(nums[0]) - 1);
    // for (auto i = 0; i < sizeof(nums) / sizeof(nums[0]); i++)
    //{
    //     cout << nums[i] << " ";
    // }
    // cout << endl;
    return 0;
}