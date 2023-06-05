#include <iostream>
#include <vector>
#include <set>
using namespace std;

class Solution {
    public :
    int mxWtrRn(vector<int> height){
        int res = 0;
        int left = 0;
        int right = height.size() - 1;

while (left < right){
    int area = (right - left) * min(height[left], height[right]);
    res = max(area, res);

    if (height[left] < height[right]){
        left++;
    }else {
        right--;
    }
};
return res;
    }

int secondLargest(vector<int> & nums){
int first = 0;
int second = -1;

for (int i = 1; i < nums.size();i++){
if (nums[i] > nums[first]){
        second = first;
        first = i;
}
else if (nums[i] < nums[first])
{
    if (second == -1 || nums[second] < nums[i]){
        second = i;
    }
}else if (nums[second] == nums[first]){
    continue;
}
}
return second;
    }
};

int main (){
    vector<int> inputArr ={1, 6, 2, 5, 4, 8,8, 3, 7};
    Solution sol;
    int val = sol.mxWtrRn(inputArr);
    cout << val << endl;
    int val2 = sol.secondLargest(inputArr);
    cout << val2 << endl;
};
