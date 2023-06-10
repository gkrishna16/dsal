#include <iostream>
#include <vector>
using namespace std;

void merge(int arr[], int s, int mid, int e){
  int const subArrayOne = mid - s + 1;
  int const subArrayTwo = e - mid;

  // Create temp arrays
  auto *leftArray = new int[subArrayOne],
       *rightArray = new int[subArrayTwo];

  // Copy data to temp arrays
  for (auto i = 0; i < subArrayOne;i++){
    leftArray[i] = arr[s + i];
  };
  for (auto j = 0; j < subArrayTwo;j++){
    rightArray[j] = arr[mid + 1 + j];
  }
};

void merge_sort(int arr[], int s, int e){
  if (s < e){
    int mid = s + (e - s) / 2;
    merge_sort(arr, s, mid);
    merge_sort(arr, mid + 1, e);
    merge(arr, s, mid, e);
  }
};

int main (){

  int arr[] = {1, 2, 3, 4, 5};
  for (auto i = 0; i < sizeof(arr) / sizeof(arr[0]);i++){
    cout << arr[i] << " ";
  }
  cout << endl;
}