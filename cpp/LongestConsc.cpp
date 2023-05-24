#include <iostream>
#include <vector>
#include <set>
using namespace std;

void LongestSubstrng(vector<int> & arr)
{
    int longest = 0;
    set<int> st;

    // for ()

    for (auto& s: arr){
        st.insert(s);
    }

    for (auto & t : st){
        cout << t << endl;
    }
}

int main(){
    vector<int> vc = {1, 1, 3, 4, 2};
    LongestSubstrng(vc);
}