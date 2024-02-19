#include <iostream> // preprocessor directive - before compilation all the files would be copeid
#include <vector>

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

    int partition(vector<int> &nums, int low, int high)
    {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++)
        {
            if (pivot > nums[j])
            {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return (i + 1);
    }

    void quickSort(vector<int> &nums, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }
    void swap(vector<int> &nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};

int main()
{
    vector<int> arr = {5, 4, 3, -10, 2, 1, 100};

    int nums[] = {5, 4, 3, -10, 2, 1, 100};
    Sort srt;
    srt.quickSort(arr, 0, arr.size() - 1);

    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 1;
}
