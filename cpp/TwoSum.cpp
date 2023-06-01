#include <iostream>
#include <vector>
using namespace std;

void TwoSum(vector<int> & nums)
{
    for (int i = 0; i <nums.size(); i++)
    {
        cout << nums[i] << endl;
    }
};

int main(){
    vector<int> myNumbers = {1, 2, 4, 5, 5};
    TwoSum(myNumbers);
};