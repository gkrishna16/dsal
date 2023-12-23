#include <iostream>
using namespace std;

// max consecutive ones

int maxConsOnes(vector<int> &nums)
{
  int cnt = 0;
  int maxi = 0;

  for (int i = 0; i < nums.size(); i++)
  {
    if (nums[i] == 1)
    {
      cnt++;
    }

    else
    {
      cnt = 0;
    }

    maxi = max(cnt, maxi);
  }

  return maxi;
}

void BubbleSort(vector<int> &nums)
{
  bool didSwap = false;
  for (int i = 0; i < nums.size() - 1; i++)
  {
    for (int j = 0; j < nums.size() - 1; j++)
    {
      if (nums[j] > nums[j + 1])
      {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
        didSwap = true;
      }
      if (didSwap == false)
      {
        break;
      }
    }
  }
}

int main()
{
  vector<int> nums = {5, 4, 3, 2, 1};
  BubbleSort(nums);

  for (auto &a : nums)
  {
    cout << a << " ";
  }
  cout << endl;

  // int *ptr = NULL;
  // cout << "The value of ptr is " << ptr;

  // double pointer
  // int a = 10;
  // int *p = &a;
  // stores pointer to pointer
  // int **q = &p;

  // cout << q << endl;

  // int arr[10];
  // cout << arr[0] << endl;

  return 0;
}

// class MyClass
//{
// public:
//   void myFunction()
//   {
//     cout << "Some content in parent class.";
//   }
// };

// Derived class (child)
// class MyChild : public MyClass
//{
// };

// Derived class (grandchild)
// class MyGrandChild : public MyChild
//{
// };

// class Construct
//{
// public:
//   int num;
//   Construct(int num)
//   {
//     this->num = num;
//   }
// };

// MyGrandChild myObj;
// myObj.myFunction();

// Construct cons(200);
// Construct *constr = new Construct(100);
// cout << constr << endl;
// cout << constr->num << endl;
// cout << cons.num << endl;
