#include <iostream>
#include <vector>
using namespace std;

// void merge(int arr[], int s, int mid, int e)
//{
//     int const leftArrLen = s - mid + 1;
// }

// void merge_sort(int arr[], int s, int e)
//{
//     if (s >= e)
//         return;
//     int mid = s + (e - s) / 2;
//     merge_sort(arr, s, mid);
//     merge_sort(arr, mid + 1, e);
//     merge(arr, s, mid, e);
// }

void merge(vector<int> &arr, int low, int mid, int high)
{
    vector<int> temp;
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high)
    {
        if (arr[left] <= arr[right])
        {
            temp.push_back(arr[left]);
            left++;
        }
        else
        {
            temp.push_back(arr[right]);
            right++;
        }
    }

    while (left <= mid)
    {
        temp.push_back(arr[left]);
        left++;
    }
    while (right <= high)
    {
        temp.push_back(arr[right]);
        right++;
    }

    for (int i = low; i <= high; i++)
    {
        arr[i] = temp[i - low];
    };
}
void merge_sort(vector<int> &nums, int s, int e)
{
    if (s >= e)
        return;

    int mid = s + (e - s) / 2;
    merge_sort(nums, s, mid);
    merge_sort(nums, mid + 1, e);
    merge(nums, s, mid, e);
}

int main()
{
    vector<int> arr = {9, 4, 7, 6, 3, 1, 5};
    int n = 7;

    cout << "Before Sorting Array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    merge_sort(arr, 0, n - 1);
    cout << "After Sorting Array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 1;
}
