#include <iostream> // preprocessor directive - before compilation all the files would be copeid
#include <vector>
#include <algorithm>

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

    int partition(vector<int> &nums, int start, int end, int pivot)
    {
        while (start <= end)
        {
            while (nums[start] < pivot)
            {
                start++;
            }
            while (nums[end] > pivot)
            {
                end--;
            }

            if (start <= end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }

    void quickSort(vector<int> &nums, int start, int end)
    {
        if (start < end)
        {
            int pivot = nums[(start + end) / 2];
            int index = partition(nums, start, end, pivot);

            quickSort(nums, start, index - 1);
            quickSort(nums, index, end);
        }
    }
    void merge(vector<int> &nums, int start, int mid, int end)
    {
        int i = start;
        int j = mid + 1;
        vector<int> temp;

        while (i <= mid && j <= end)
        {
            if (nums[i] <= nums[j])
            {
                temp.push_back(nums[i]);
                i++;
            }
            else
            {
                temp.push_back(nums[j]);
                j++;
            }
        }

        while (i <= mid)
        {
            temp.push_back(nums[i]);
            i++;
        }

        while (j <= end)
        {
            temp.push_back(nums[j]);
            j++;
        };

        for (int k = start; k <= end; k++)
        {
            nums[k] = temp[k - start];
        }
    }

    void merge_sort(vector<int> &nums, int start, int end)
    {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        merge_sort(nums, start, mid);
        merge_sort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    int partition2(vector<int> &nums, int start, int end, int pivot)
    {
        while (start <= end)
        {
            if (nums[start] < pivot)
            {
                start++;
            }
            if (nums[end] > pivot)
            {
                end--;
            }

            if (start <= end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }

    void quickSort2(vector<int> &nums, int start, int end)
    {
        if (start < end)
        {
            int pivot = nums[start + (end - start) / 2];
            int index = partition2(nums, start, end, pivot);

            quickSort2(nums, start, index - 1);
            quickSort2(nums, index, end);
        }
    }
};

int main()
{
    vector<int> nums = {10, 9, 8, 7, 6, 5, 4};
    Sort srt;

    srt.quickSort2(nums, 0, nums.size() - 1);

    for (auto &num : nums)
    {
        cout << num << " ";
    }

    cout << endl;
    // srt.merge_sort(nums, 0, nums.size() - 1);

    // srt.recurBubbleSort(nums, nums.size());
    // srt.recurInsertionSort(nums, 0, nums.size());
    // srt.quickSort(nums, 0, nums.size() - 1);
}