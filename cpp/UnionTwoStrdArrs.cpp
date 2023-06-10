#include <iostream>
#include <vector>
//#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
vector < int > FindUnion(int arr1[], int arr2[], int n, int m) {
  int i = 0, j = 0; // pointers
  vector < int > Union; // Uninon vector
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) // Case 1 and 2
    {
      if (Union.size() == 0 || Union.back() != arr1[i])
        Union.push_back(arr1[i]);
      i++;
    } else // case 3
    {
      if (Union.size() == 0 || Union.back() != arr2[j])
        Union.push_back(arr2[j]);
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (Union.back() != arr1[i])
      Union.push_back(arr1[i]);
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (Union.back() != arr2[j])
      Union.push_back(arr2[j]);
    j++;
  }
  return Union;
}
};

int main()
{
Solution sol;
int n = 10, m = 7;
int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int arr2[] = {2, 3, 4, 4, 5, 11, 12};
vector<int> Union = sol.FindUnion(arr1, arr2, n, m);
cout << "Union of arr1 and arr2 is  " << endl;
for (auto &val : Union)
  cout << val << " ";
cout << endl;
return 0;
}