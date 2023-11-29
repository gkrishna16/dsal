#include <iostream>
#include <vector>
using namespace std;

void isArray(vector<int> &nums)
{

    for (int i = 0; i < nums.size() - 1; i++)
    {
        if (nums[i + 1] > nums[i])
        {
            cout << "True";
            return;
        }

        cout << "False" << endl;
        return;
    }
}

int main()
{
    // vector<int> nums = {1, 2, 3, 4, 0};
    // isArray(nums);

    cout << 2 % 4 << endl;
}