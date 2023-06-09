#include <iostream>
#include <vector>
using namespace std;

//void zeroesToEnd(int arr[] , int n )
//{
//    int temp[n];
//    int k = 0;
//    for (int i = 0; i < n;i++)
//    {
//        if (arr[i] != 0)
//        {
//            temp[k] = arr[i];
//            k++;
//        }
//    }
//    while (k < n )
//{
//        temp[k] = 0;
//        k++;
//}

//for (int i = 0; i < n;i++){
//        cout << temp[i] << " ";
//}
//cout << endl;
//}

void zeroesToEnd(int arr[], int n)
{
    int k = 0;
    while (k < n)
    {
        if (arr[k]  == 0)
        {
            break;
        }else {
            k = k + 1;
        }
    }

    int i = k, j = k + 1;
    while ( i < n && j < n )
    {
        if (arr[j] != 0)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        j++;
    }

    for (int i = 0; i < n;i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main(){

int arr[] = {1, 3, 0, 9, 8,  0, 1, 3};
zeroesToEnd(arr, sizeof(arr)/sizeof(arr[0]));

cout << "the main function" << endl;
}