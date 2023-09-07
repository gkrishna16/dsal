#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void print1(int n)
    {

        // space star
        // 3 1
        // 2 3
        // 1 5
        // 0 7
        int i = 0;
        while (i < n)
        {
            // print spaces
            int sp = 0;
            int sptl = n - i - 1;
            while (sp < sptl)
            {
                cout << " ";
                sp++;
            }
            // print stars
            int st = 0;
            int sttill = 2 * i + 1;
            while (st < sttill)
            {
                cout << "*";
                st++;
            }
            cout << endl;
            i++;
        }
    }

    void print2(int n)
    {
        int i = 0;
        while (i < n)
        {
            // print space;
            int sp = 0;
            while (sp < i)
            {
                cout << " ";
                sp++;
            }

            // print star
            int str = 0;
            int strtil = (n * 2) - (2 * i) - 1;
            while (str < strtil)
            {
                cout << "*";
                str++;
            }
            cout << endl;
            i++;
        }
    }

    void sitecore(int n)
    {
        int i = 1;
        while (i <= n)
        {
            int j = i;
            while (j >= 1)
            {
                cout << j << " ";
                j--;
            }
            cout << endl;
            i++;
        }
    }

    void Pattern11(int n)
    {
        int start = 1;
        int i = 0;
        while (i < n)
        {
            if (i % 2 == 0)
            {
                start = 1;
            }
            else
            {
                start = 0;
            }
            int j = 0;
            while (j <= i)
            {
                cout << start;
                start = 1 - start;
                j++;
            }
            cout << endl;
            i++;
        }
    }
};

int main()
{
    vector<int> nums = {5, 4, 3, 2, 1};
    Solution sol;
    // for (int i = 0; i < nums.size(); i++)
    //{
    //     cout << nums[i] << "  ";
    // }
    //  sol.insertionSort(nums);
    // sol.print1(4);
    // sol.print2(4);
    // cout << "-------" << endl;
    // sol.sitecore(5);
    sol.Pattern11(5);

    // cout << 1 % 2 << endl;
    // cout << 0 % 2 << endl;
    // cout << 2 % 2 << endl;
}