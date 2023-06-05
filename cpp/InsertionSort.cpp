#include <iostream>
#include <vector>
using namespace std;

class Solution {
    public :
void insertionSort(vector<int> & nums){

    for (int i = 0; i < nums.size();i++){
        int j = i;

        while (j > 0 &&  nums[j-1] > nums[j]){
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            j--;
        }
    }
    cout << endl;

    for (int i = 0; i < nums.size();i++){
        cout << nums[i] << " ";
    }
    cout << endl;
}
};


int main (){

vector<int> nums = {13, 46, 24, 52, 20, 9};
Solution sol;
for (int i = 0; i < nums.size();i++){
    cout << nums[i] << " ";
}
    sol.insertionSort(nums);
}