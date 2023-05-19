#include <iostream>
#include <vector>
using namespace std;

void BubbleSort(vector<int> & nums)
{
    for (int i = 0; i < nums.size() - 1; i++)
    {
        for (int j = i+1; j < nums.size();j++)
        {
            if (nums[i] < nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }

    
}

int main ()
{

    vector<int> v = {4,3,2,1};
   BubbleSort(v);
    for (auto x : v) {
        cout << x << endl;
    };
}
