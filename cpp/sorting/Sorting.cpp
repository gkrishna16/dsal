#include <iostream> // preprocessor directive - before compilation all the files would be copeid
#include <vector>
#include <algorithm>

using namespace std;

class Sort
{
public:
    void merge(int nums[], int left, int mid, int right)
    {
        int const n1 = mid - left + 1;
        int const n2 = right - mid;

        auto *leftArray = new int[n1], *rightArray = new int[n2];

        // Copy data to temp arrays leftArray[] and rightArray[]
        for (auto i = 0; i < n1; i++)
        {
            leftArray[i] = nums[left + i];
        }
        for (auto j = 0; j < n2; j++)
        {
            rightArray[j] = nums[mid + 1 + j];
        }

        auto leftArrIndex = 0,
             rightArrIndex = 0;
        int mergedArrIndex = left;
        while (leftArrIndex < n1 && rightArrIndex < n2)
        {
            if (leftArray[leftArrIndex] < rightArray[rightArrIndex])
            {
                nums[mergedArrIndex] = leftArray[leftArrIndex];
                leftArrIndex++;
            }
            else
            {
                nums[mergedArrIndex] = rightArray[rightArrIndex];
                rightArrIndex++;
            }
            mergedArrIndex++;
        }
    }

    void merge_sort(int nums[], int start, int end)
    {
        if (start < end)
        {
            int mid = start + (end - start) / 2;
            merge_sort(nums, start, mid);
            merge_sort(nums, mid + 1, end);

            merge(nums, start, mid, end);
        }
    }
};

int main()
{
    vector<int> arr = {5, 4, 3, -10, 2, 1, 100};

    int nums[] = {5, 4, 3, -10, 2, 1, 100};
    Sort srt;

    int n = sizeof(nums) / sizeof(nums[0]);

    // cout <<  << endl;
    srt.merge_sort(nums, 0, n - 1);

    for (int i = 0; i < sizeof(nums) / sizeof(nums[i]); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}