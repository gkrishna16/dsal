#include <iostream>
#include <vector>
using namespace std;

class Sort
{
public:
    void bubbleSort(vector<int> &nums)
    {
        bool swapped;
        for (int i = 0; i < nums.size() - 1; i++)
        {
            for (int j = 0; j < nums.size() - 1 - i; j++)
            {

                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    void recurBubbleSort(vector<int> &nums, int n)
    {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++)
        {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        recurBubbleSort(nums, n - 1);
    }

    void recurInsertionSort(vector<int> &nums, int i, int n)
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
        recurInsertionSort(nums, i + 1, n);
    }

    void selection_sort(vector<int> &nums)
    {
        for (int i = 0; i < nums.size(); i++)
        {
            int mini = i;
            for (int j = i + 1; j < nums.size(); j++)
            {
                if (nums[j] < nums[mini])
                {
                    mini = j;
                }
            }
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }
    }
};

int main()
{
    vector<int> nums = {10, 9, 8, 7, 6, 5, 4};
    Sort srt;
    // srt.recurBubbleSort(nums, nums.size());
    // srt.recurInsertionSort(nums, 0, nums.size());
    srt.selection_sort(nums);

    for (auto &num : nums)
    {
        cout << num << " ";
    }

    cout << endl;
}