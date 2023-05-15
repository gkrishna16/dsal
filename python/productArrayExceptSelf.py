# class Solution:
#     def productOfSelfExceptSelf(self, nums):


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, val):
        newNode = Node(val)
        if self.head is None:
            self.head = newNode
            return
        current = self.head
        while current.next != None:
            current = current.next
        current.next = newNode

    def print(self):
        current = self.head
        if current is None:
            print("the head is empty.")
            return

        while current is not None:
            print(current.data, end=" -> ")
            current = current.next
        print('')


ll = LinkedList()
ll.append(100)
ll.append(200)
ll.append(300)
ll.print()
