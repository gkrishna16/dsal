#include <iostream>
#include <vector>
using namespace std;


//  bool isAnagram (string a , string b)
 
//  {
//     if (a.length() != b.length()){
//         return false;
//     }

//     unordered_map<int, int> aMap, bMap;
//     for (int i = 0; i < a.length();i++)
//     {
//         if (aMap.find(a[i]) == aMap.end()){aMap[a[i]] = 0;}
//             if (bMap.find(b[i]) == bMap.end())
//               {  bMap[b[i]] = 0;}
//                     aMap[a[i]]++;
//             bMap[b[i]]++;
//     }

 
//  }


// void Frequency (vector<int> & arr, int n)
// {
//     unordered_map<int, int> map;
//     for (int i = 0; i < n;i++)
//     {
//         map[arr[i]]++;
//     };

//     // Traverse through map and print frequencies
//     for (auto x : map)
//     {
//         cout << x.first << " : " << x.second << endl;
//     }
// }

int main() {

   vector<int> arr;
   int Arr[] = {10, 5, 10, 15, 10, 5};

   for (int i = 0; i < sizeof(Arr) / sizeof(Arr[0]); i++)
   {
    //    arr[i] = Arr[i];
    arr.push_back(Arr[i]);
   }

   cout << arr[0] << endl;

   return 1;
}

