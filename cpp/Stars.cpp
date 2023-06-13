#include <iostream>
#include <vector>
using namespace std;

void Triangle(int n)
{
    int i = 1;
    // spaces
    while (i <= n)
    {
        // spaces
        int s = 1;
        int sp = n - i;
        while (s <= sp)
        {
            cout << " ";
            s++;
        }
        // stars
        int str = 1;
        int star = (2 * i) - 1;
        while (str <= star)
        {
            cout << "*";
            str++;
        }
        cout << endl;
        i++;
    }
}

int main()
{
    int *arr1 = new int[4];
    for (int i = 0; i < 4; i++)
    {
        arr1[i] = i;
        cout << arr1[i] << " " << endl;
    }

    // Triangle(5);
}