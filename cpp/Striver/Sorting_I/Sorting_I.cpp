#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void selectionSort(int nums[], int n)
    {
        // selection sort
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (nums[j] < nums[min])
                {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        cout << "After the selection sort: "
             << "\n";
        for (int i = 0; i < n; i++)
        {
            cout << nums[i] << " ";
        }
        cout << endl;
    }

    void BubbleSort1(int nums[], int n)
    {
        // Bubble sort
        for (int i = n - 1; i >= 0; i--)
        {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    didSwap = 1;
                }
            }

            if (didSwap == 0)
            {
                break;
            }
        }
        cout << "After Using bubble sort : "
             << "\n";

        for (int i = 0; i < n; i++)
        {
            cout << nums[i] << endl;
        }
        cout << "\n";
    }
    void BubbleSort2(int nums[], int n)
    {
        // bubble sort
        for (int i = n - 1; i >= 0; i--)
        {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0)
            {
                break;
            }
        }

        cout << "After using bubble sort: " << endl;
        for (int i = 0; i < n; i++)
        {
            cout << nums[i] << " ";
        }
        cout << endl;
    }

    void insertion_sort(int nums[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j])
            {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        cout << "After using insertion sort : " << endl;
        for (int i = 0; i < n; i++)
        {
            cout << nums[i] << " ";
        }
        cout << endl;
    }
    int sortArr(vector<int> &arr)
    {
        sort(arr.begin(), arr.end());
        return arr[arr.size() - 1];
    }

    // int findLargestElement(int arr[])
    //{
    //     int max = arr[0];
    //     for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
    //     {
    //         if (arr[i] > max)
    //         {
    //             max = arr[i];
    //         }
    //     }
    //     cout << max;
    //     return max;
    // }

    void insertionSort(vector<int> &nums)
    {
        for (int i = 0; i < nums.size(); i++)
        {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j])
            {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            };
        }
    }

    void BubbleSort3(vector<int> &nums)
    {
        bool swapped;
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            swapped = 0;
            for (int j = 0; j < i; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = 1;
                }
                if (swapped == 0)
                {
                    break;
                }
            }
        }
    }

    void insrtnSort(vector<int> &nums, int i, int n)
    {
        if (i == n)
            return;

        int j = i;
        while (j > 0 && nums[j - 1] > nums[j])
        {
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
            j--;
        }
        insrtnSort(nums, i + 1, n);
    }
};

int main()
{
    vector<int> nums = {5, 4, 3, 2, 1};
    Solution sol;
    sol.insrtnSort(nums, 0, nums.size());
    for (auto &a : nums)
    {
        cout << a << " ";
    }
    cout << endl;
    return 1;
}
