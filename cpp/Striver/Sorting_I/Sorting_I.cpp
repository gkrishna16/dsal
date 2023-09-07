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

    static int findLargestElement(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        cout << max;
        return max;
    }
};

int main()
{
    int nums[] = {5, 4, 3, 2, 1};
    Solution sol;

    sol.findLargestElement(nums);
    cout << endl;
    return 1;
}
