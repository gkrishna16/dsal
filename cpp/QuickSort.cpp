#include <iostream>
#include <vector>
using namespace std;
int partition (vector<int> nums, int low , int high){
    int pivot = nums[low];
    int i = low;
    int j = high;

    

}
void quickSort(vector<int> & nums, int low , int high){
    // checking if the range > 1
    if (low < high){
        int pIndex = partition(nums, low, high);

        // left subarray
        quickSort(nums, low, pIndex - 1);

        // right subarry
        quickSort(nums, pIndex + 1,high);
    }
}



int main (){

    
}