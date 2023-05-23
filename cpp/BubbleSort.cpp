#include <iostream>
#include <vector>
using namespace std;

void BubbleSort(vector<int> & nums)
{
    for (int i = 0; i < nums.size(); i++)
    {
        bool flag = true;
        for (int j = 0; j < nums.size() - 1; j++)
        {
            if (nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                flag = false;
            }
        }
        if (flag == true) break;
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


