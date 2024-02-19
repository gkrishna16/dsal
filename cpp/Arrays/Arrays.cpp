#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
using namespace std;

int maxSubArr(vector<int> &nums)
{
    int maxSubArr = INT_MIN;
    // Brute force
    for (int i = 0; i < nums.size(); i++)
    {
        int currentSubArr = 0;
        for (int j = i; j < nums.size(); j++)
        {
            currentSubArr += nums[j];
            maxSubArr = max(maxSubArr, currentSubArr);
        }
    }

    return maxSubArr;
};

int main()
{

    return 1;
}