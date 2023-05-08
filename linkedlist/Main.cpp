#include <iostream>
using namespace std;

class Node {
    public:
        int data;
        Node *next;
        Node(int data) {
            this->data = data;
            this->next = NULL;
}
};

void insertAtHead(Node * &head, int d)
{
            Node *temp = new Node(d);
            temp -> next = head;
            head = temp;
}

void insertAtTail(Node * &tail, int t)
{
    // new node created
    Node * temp = new Node(t);
    tail -> next = temp;
    tail = temp;
}

void print(Node * &head)
{
Node * temp = head;
while (temp != NULL)
{
    cout << temp -> data << " -> ";
    temp = temp -> next;
}
cout << endl;
};

void insertAt(Node * &head , int index, int value){
    if (head == NULL){
    cout << "The linked list is empty" << endl;
    return;
    }
    Node *newNode = new Node(value);
    int count = 0;
    // count all the elements
    Node* current = head;
    while (current != NULL){
    count++;
    current = current->next;
    }

    // The node after the last one
    // Append them in the end
    if (index == count + 1)
    {
    insertAtTail(head, value);
    return;
    }
   if (index == 0){
    insertAtHead(head, value);
    return;
   }
   Node *prev;
   Node *curr;
   curr = head;
   int counter = 0;
   while (counter < index)
   {
    prev = curr;
    curr = curr->next;
    counter++;
   }
   newNode->next = curr;
   prev->next = newNode;
}
int sizeOfLinkedList(Node*& head){
   Node *current = head;
   int size = 0;
   while (current != NULL)
   {
    size++;
    current = current->next;
   }

//    cout << size << endl;
   return size;
}

void deleteAt(Node* &head, int index)
{
if (sizeOfLinkedList(head) == 0)
{
    cout << "The linked list is empty." << endl;
    return;
}
Node *prev;
Node *curr;

int counter = 0;
curr = head;
while (counter < index)
{
    counter++;
    prev = curr;
    curr = curr->next;
}
prev->next = curr->next;
};

int deleteValue(Node*&head, int value)
{
    if (sizeOfLinkedList(head) == 0){
    cout << "The linked list is empty" << endl;
    return -1;
    }
    Node *prev;
    Node *current;
    current = head;
   
    while (current != NULL)
    {
        if (current->data == value)
        {
            if (prev == NULL)
            {
                head = current->next;
            }else {
                prev->next = current->next;
            }
            return current->data;
        };
        prev = current;
        current = current->next;
    };
}

int main()
{
        Node * node1 = new Node(10);
        Node * head = node1;
        Node * tail = node1;
        // print(head);
        insertAtTail(tail, 12);
        // print(tail);
        insertAtTail(tail, 15);
        print(head);
        insertAt(head, 1, 22);
        print(head);
        insertAt(head, 0, 101);
        print(head);
        insertAt(head, 5, 105);
        print(head);
        insertAt(head, 5, 106);
        print(head);
        sizeOfLinkedList(head);
        deleteAt(head, 2);
        print(head);
        deleteValue(head,106);
        print(head);
        deleteValue(head,12);
        print(head);
        delete head;
        delete tail;
}


