#include <iostream>
#include <vector>
using namespace std;

int getLongestSubarray(vector<int> & nums, int k)
{
    int sum = 0;
    int len = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        for (int j = i; j < nums.size();j++){
            sum += nums[j];

            if (sum == k){
                len = max(len, j - i + 1);
            }
        }
    }
    return len;
}

int main (){

    vector<int> a = {-1, 1, 1};
    int k = 1;
    int len = getLongestSubarray(a, k);
    cout << "The length of the longest subarray is: " << len << "\n";

    return 1;
}