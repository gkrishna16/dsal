#include <iostream>
#include <vector>
using namespace std;

void merge(int * arr, int s, int e){
    int mid = (s + e) / 2;
    int len1 = mid - s + 1;
    int len2 = e - mid;

    int *first = new int[len1];
    int *second = new int[len2];

    // the new algo coming 

    int mainArrayIndex= s;

    // copy values in the first half
    for (int i = 0; i < len1;i++){
        first[i] = arr[mainArrayIndex++];
    }
    // copy values in the second half
    int k = mid + 1;
    for (int i = 0; i < len2;i++){
        second[i] = arr[mainArrayIndex++];
    }

    // merge two sorted arrays
    int index1 = 0;
    int index2 = 0;
    mainArrayIndex = s;

}

void mergeSort(int * arr, int s , int e){
    // base case 
if (s >= e){
   { return;}


    int mid = (s + e) / 2;
    // left part sort karna h
    mergeSort(arr, s, mid);
    // right part sort karna h
    mergeSort(arr, mid + 1, e);
    // merge
    merge(arr, s, e);
}
}


void reverseArray(int * arr, int n){
int low = 0;
int high = n - 1;
while ( low <= high  ){
    int temp = arr[low];
    arr[low ] = arr[high];
    arr[high] = temp;
    low++;
    high--;
}

for (int i = 0; i < n;i++){
    cout << arr[i] << " ";
}
cout << endl;
}

int main ()
{
    //int nums[] = {5, 4, 3, 2, 1};
    //int n = 5;
    //reverseArray(nums, n);
    // mergeSort(nums, 0, n - 1);

    // for (int i = 0; i < sizeof(nums) / sizeof(nums[0]);i++){
    //cout << nums[i] << endl;
    // }

string name = "Gopal";
cout << name << endl;
}