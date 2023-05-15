#include <iostream>
#include <vector>
using namespace std;


bool validAnagrams(string s , string t) 
{
    unordered_map<string, int> ms ,mt;
    if (s.length() != t.length())
{
    return false;
}

for (int i = 0; i < s.length(); i++) {
    ms[s[i]]++;
    mt[t[i]]++;
}

for (auto x :s) {
    if (ms[x]!= mt[x])
        return false;
}

return true;
}

int main () {


return 1;
}