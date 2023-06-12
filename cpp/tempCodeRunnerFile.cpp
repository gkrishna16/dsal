#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void insertionSort(vector<int> &arr)
    {
        for (int i = 1; i < arr.size(); i++)
        {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        cout << "After using insertion sort" << endl;

        for (int i = 0; i < arr.size(); i++)
        {
            cout << arr[i] << "  ";
        }
        cout << endl;
    }
};

int main()
{
    vector<int> nums = {5, 4, 3, 2, 1};
    Solution sol;
    for (int i = 0; i < nums.size(); i++)
    {
        cout << nums[i] << " ";
    }
    sol.insertionSort(nums);
}