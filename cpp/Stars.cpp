#include <iostream>
#include <vector>
using namespace std;

void Triangle(int n)
{
    int i = 1;
    // spaces
    while (i <= n){
        // spaces
        int s = 1;
        int sp = n - i;
        while(s<=sp){
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

int main(){

    Triangle(5);

    cout << "The main function" << endl;
}