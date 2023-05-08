#include <iostream>
using namespace std;

class MyClass {
  public:
    void myFunction() {
      cout << "Some content in parent class." ;
    }
};

// Derived class (child)
class MyChild: public MyClass {
};

// Derived class (grandchild)
class MyGrandChild: public MyChild {
};

class Construct {
    public:
    int num;
    Construct(int num)
    {
      this->num = num;
    }
};

int main() {
  MyGrandChild myObj;
  myObj.myFunction();

  Construct cons(200);
  Construct *constr = new Construct(100);
  cout << constr << endl;
  cout << constr->num << endl;
  cout << cons.num << endl;

  return 0;
}