#include <iostream>
using namespace std;

class Node 
{
    public :
        int data;
        Node *next;
        Node (int data )
        {
            this->data = data;
        }
};

void InserAtTail(Node * & tail , int t)
{
        Node *current = new Node(t);
        tail->next = current;
        tail = current;
}

void InsertAtHead(Node * &head, int h){
if (head ==NULL)
{
            head = new Node(h);
            return;
}

Node *current = new Node(h);
current->next = head;
head = current;
}

void Print(Node * head) {
Node *current = head;
while (current != NULL)
{
            cout << current->data << " -> ";
            current = current->next;
}
cout << endl;
}

int main()
{
        Node *node1 = new Node(10);
        Node *head = node1;
        Node *tail = node1;
        // = node1;
        // Node *tail = node1;

        // InserAtTail(tail,100);
        // InsertAtHead(head,200);
        InsertAtHead(head,100);
        InsertAtHead(head,200);
        InserAtTail(tail, 400);
        Print(head);

        cout << "Keep coding." << endl;
}

