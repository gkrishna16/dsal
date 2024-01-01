#include <iostream>
#include <vector>
using namespace std;

void countFreq(int arr[], int n)
{
    vector<bool> visited(n, false);
    for (int i = 0; i < n; i++)
    {
        // skip this element if already processed
        if (visited[i] == true)
            continue;

        // count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                visited[j] = true;
                count++;
            }
        }
        cout << arr[i] << " " << count << endl;
    }
}

void countFreq2(int arr[], int n)
{
    vector<bool> visited(n, false);
    for (int i = 0; i < n; i++)
    {
        if (visited[i] == true)
            continue;

        int count = 1;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                visited[j] = true;
                count++;
            }
        }

        cout << arr[i] << " " << count << endl;
    }
};

void countFreq3(int arr[], int n)
{
    unordered_map<int, int> map;
    for (int i = 0; i < n; i++)
        map[arr[i]]++;

    // Traverse through map and print frequencies
    for (auto x : map)
    {
        cout << x.first << " -- " << x.second << endl;
    }
}

void maxFreq(vector<int> &nums, int n)
{
    vector<int> flags(n, false);
    int maxFreq = 0, maxEl = 0;
    int minEl = 0, minFreq = n;

    for (int i = 0; i < n; i++)
    {
        if (flags[i] == true)
            continue;

        int count = 1;
        for (int j = i + 1; j < n; j++)
        {
            if (nums[i] == nums[j])
            {
                flags[j] = true;
                count++;
            }
        }

        if (maxFreq < count)
        {
            maxEl = nums[i];
            maxFreq = count;
        }
        if (minFreq > count)
        {
            minFreq = count;
            minEl = nums[i];
        }
    }

    cout << "the max element is " << maxEl << endl;
    cout << "the min element is " << minEl << endl;
}

void Frequency(vector<int> arr, int n)
{
    unordered_map<int, int> map;

    for (int i = 0; i < n; i++)
    {
        map[arr[i]]++;
    }
    int maxFreq = 0, maxEl = 0;
    int minFreq = n, minEl = 0;

    for (auto it : map)
    {
        int count = it.second;
        int element = it.first;

        if (count > maxFreq)
        {
            maxEl = element;
            maxFreq = count;
        }

        if (count < minFreq)
        {
            minFreq = count;
            minEl = element;
        }
    }

    cout << "The highest element is : " << maxEl << endl;
    cout << "The lowest element is : " << minEl << endl;
}

int main()
{
    vector<int> arr = {10, 5, 10, 15, 10, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    // countFreq2(arr, n);
    cout << "---------- " << endl;
    Frequency(arr, n);

    unordered_map<int, int> map;

    for (auto i = 0; i < arr.size(); i++)
    {
        map[arr[i]]++;
    }

    for (auto it : map)
    {
        cout << it.first << " " << it.second << endl;
    }
    return 0;
}