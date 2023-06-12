#include <iostream>
#include <vector>
using namespace std;

void countFreq(int arr[], int n)
{
    vector<bool> visited(n, false);

    int maxFreq = 0, minFreq = n;
    int maxEle = 0, minEle = 0;

    for (int i = 0; i < n; i++)
    {
        if (visited[i] == true)
        {
            continue;
        }
        int count = 1;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                visited[j] = true;
                count++;
            }
        }

        if (count > maxFreq)
        {
            maxFreq = count;
            maxEle = arr[i];
        }
        if (count < minFreq)
        {
            minEle = arr[i];
            minFreq = count;
        }
    }
    cout << "The largest frequency element is: " << maxEle << endl;
    cout << "The lowest frequency element is: " << minEle << endl;
}

void Frequency(int arr[], int n)
{
    unordered_map<int, int> map;
    for (int i = 0; i < n; i++)
    {
        map[arr[i]]++;
    }

    int maxFreq = 0, minFreq = n;
    int maxEle = 0, minEle = 0;

    for (auto it : map)
    {
        int count = it.second;
        int element = it.first;

        if (count > maxFreq)
        {
            maxFreq = count;
            maxEle = element;
        }
        if (count < minFreq)
        {
            minFreq = count;
            minEle = element;
        }
    }
    cout << "The highest frequency element is: " << maxEle << "\n";
    cout << "The lowest frequency element is: " << minEle << "\n";
}

int main()
{
    int arr[] = {10, 5, 10, 15, 10, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    countFreq(arr, n);

    return 0;
}