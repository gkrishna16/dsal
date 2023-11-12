#include <iostream>
#include <vector>
#include <unordered_set>
#include <map>
using namespace std;

class Solution
{
public:
    void setMatrix(vector<vector<int>> &matrix)
    {
        bool row0 = false, col0 = false;
        for (int i = 0; i < matrix.size(); i++)
        {

            for (int j = 0; j < matrix[0].size(); j++)
            {
                if (matrix[i][j] == 0)
                {
                    if (i == 0)
                        row0 = true;
                }
                if (j == 0)
                {
                    col0 = true;
                }
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
        // set all the zeroes
        for (int i = 1; i < matrix.size(); i++)
        {
            for (int j = 1; j < matrix[0].size(); j++)
            {
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // set 0, first row and column if required
        if (col0)
        {
            for (int j = 0; j < matrix.size(); j++)
            {
                matrix[j][0] = 0;
            }
        }

        if (row0)
        {
            for (int i = 0; i < matrix[0].size(); i++)
            {
                matrix[0][i] = 0;
            }
        }
    }

    int majorityElement(int v[])
    {
        int n = sizeof(n) / sizeof(int);
        for (int i = 0; i < n; i++)
        {
            int cnt = 0;
            for (int j = 0; j < n; j++)
            {
                if (v[i] == v[j])
                {
                    cnt++;
                }
            }

            if (cnt > n / 2)
            {
                return v[i];
            }
        }
        return -1;
    }

    int majorityEl2(vector<int> &v)
    {
        // size of the given array
        int n = v.size();
        // declaring a map:
        map<int, int> mpp;

        for (int i = 0; i < v.size(); i++)
        {
            mpp[v[i]]++;
        }

        // searching for the majority element:
        for (auto it : mpp)
        {
            if (it.second > (n / 2))
            {
                return it.first;
            }
        }

        return -1;
    }

    vector<int> RearrangebySign(vector<int> &A, int n)
    {
        vector<int> pos;
        vector<int> neg;

        for (int i = 0; i < n; i++)
        {
            if (A[i] > 0)
                pos.push_back(A[i]);
            else
                neg.push_back(A[i]);
        }

        // Positive on even indices, negatives on odd.
        for (int i = 0; i < n / 2; i++)
        {
            A[i * 2] = pos[i];
            A[i * 2 + 1] = neg[i];
        }

        return A;
    }

    vector<int> RearrangebySign(vector<int> A)
    {

        int posIndex = 0, negIndex = 1;
        vector<int> ans(A.size(), 0);
        for (int i = 0; i < A.size(); i++)
        {
            if (A[i] < 0)
            {
                ans[negIndex] = A[i];
                negIndex += 2;
            }
            else
            {
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }
        return ans;
    }

    vector<int> nextGreaterPermutation(vector<int> &A)
    {
        int n = A.size();
        int ind = -1;

        for (int i = n - 2; i >= 0; i--)
        {
            if (A[i] < A[i + 1])
            {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // if break point does not exist:
        if (ind == -1)
        {
            // reverse the whole array :
            reverse(A.begin(), A.end());
            return A;
        }

        // Step 3: find the next greater element and swap it with arr[ind]
        for (int i = n - 1; i > ind; i--)
        {
            if (A[i] > A[ind])
            {
                swap(A[i], A[ind]);
                break;
            }
        }

        // Step 3: reverse the right half
        reverse(A.begin() + ind + 1, A.end());
        return A;
    }

    vector<int> printLeaders(int arr[], int n)
    {
        vector<int> ans;
        // Last element of an array is always a leader,
        // push into ans array
        int max = arr[n - 1];
        ans.push_back(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--)
        {
            if (arr[i] > max)
            {
                ans.push_back(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }

    int longestSuccessiveElements(vector<int> &a)
    {
        int n = a.size();
        if (n == 0)
            return 0;

        // sort the array
        sort(a.begin(), a.end());
        int lastSmaller = INT_MIN;
        int cnt = 0;
        int longest = 1;

        // find longest sequence
        for (int i = 0; i < n; i++)
        {
            if (a[i - 1] == lastSmaller)
            {
                cnt++;
                lastSmaller = a[i];
            }
            else if (a[i] != lastSmaller)
            {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = max(longest, cnt);
        }
        return longest;
    }

    int longestSuccessiveEl(vector<int> &a)
    {
        int n = a.size();
        if (n == 0)
        {
            return 0;
        }
        int cnt = 0;     //
        int longest = 1; // to store the number of subsequence
        unordered_set<int> st;

        // put all the array element into set:
        for (int i = 0; i < a.size(); i++)
        {
            st.insert(a[i]);
        }

        // find the longest sequence
        for (auto it : st)
        {
            if (st.find(it - 1) == st.end())
            {
                int cnt = 1;
                int x = it;

                if (st.find(x + 1) != st.end())

                { // if 'it' is a starting number:
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = max(longest, cnt);
            }
        }
        return longest;
    }

    vector<int> nextPermutation(vector<int> &nums, int n)
    {

        // Step 1: Find the breaking point
        int ind = -1;
        for (int i = n - 1; i >= 0; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // if there is no break point, here the array is sorted in reverse and the next permutation will be array in ascending order.
        if (ind == -1)
        {
            // reverse the whole array:
            reverse(nums.begin(), nums.end());
            return nums;
        }
        // Step 2: Replace the breaking point with the next greater element / means smallest element from the right side.
        for (int j = n - 1; j > ind; j--)
        {
            if (nums[j] > nums[ind])
            {
                swap(nums[j], nums[ind]);
                break;
            }
        }

        // Step 3: sort the right side of the array from the breaking point
        reverse(nums.begin() + ind + 1, nums.end());
        return nums;
    }
    void pattern18(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (char ch = ('A' + N + 1) - i; ch <= ('A' + N - 1); ch++)
            {
                cout << ch << " ";
            }
            cout << endl;
        }
    }

    vector<vector<int>> rotate(vector<vector<int>> &matrix)
    {
        int n = matrix.size();
        vector<vector<int>> rotated(n, vector<int>(n, 0));

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return matrix;
    }

    vector<vector<int>> rotate2(vector<vector<int>> &matrix)
    {
        int n = matrix.size();
        // transposing the matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                swap(matrix[i][j], matrix[j][i]);
            }
        }

        // reversing each row of the matrix
        for (int i = 0; i < n; i++)
        {
            reverse(matrix[i].begin(), matrix[i].end());
        }
        return matrix;
    }

    void Pattern20(int n)
    {
        // initializing loop for the spaces.
        int spaces = 2 * n - 2;

        for (int i = 1; i <= (2 * n) - 1; i++)
        {
            int stars = i;
            // stars for the second half
            if (i > n)
                stars = 2 * n - i;

            // for printing the stars
            for (int j = 1; j <= stars; j++)
            {
                cout << "*";
            }

            // print the spaces
            for (int space = 1; space <= spaces - i; space++)
            {
                
            }
        }
    }
};

int main()
{
    Solution sol;

    vector<vector<int>> arr;
    arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    vector<vector<int>> rotated = sol.rotate2(arr);
    cout << "Rotated Image" << endl;
    for (int i = 0; i < rotated.size(); i++)
    {
        for (int j = 0; j < rotated[0].size(); j++)
        {
            cout << rotated[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}