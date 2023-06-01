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
};
return res;
    }
};

int main (){
    vector<int> inputArr ={1, 8, 6, 2, 5, 4, 8, 3, 7};
    Solution sol;
    int val = sol.mxWtrRn(inputArr);
    cout << val << endl;
    cout << "The main function" << endl;
};
