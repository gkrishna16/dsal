class ListNode<T> {
  value: T;
  next: ListNode<T> | null;

  constructor(value: T) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList<T> {
  head: ListNode<T> | null;
  count: number = 0;

  constructor() {
    this.head = null;
    this.count = 0;
  }

  append(value: T): void {
    let newNode = new ListNode(value);

    if (this.head === null) {
      this.head = newNode;
      this.count++;
      return;
    }
    let currentNode = this.head;
    while (currentNode.next !== null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
    this.count++;
  }

  prepend(value: T): void {
    let newNode = new ListNode(value);
    if (this.head === null) {
      this.head = newNode;
      this.count++;
      return;
    }
    newNode.next = this.head;
    this.head = newNode;
    this.count++;
  }

  put(index, value): void {
    if (index < 0 || index > this.count) {
      throw new Error(`Please enter a valid index.`);
    } else {
      let node = new ListNode(value);
      let curr: ListNode<T> | null;
      let prev: ListNode<T> | null;
      curr = this.head;

      if (index === 0) {
        node.next = this.head;
        this.head = node;
      } else {
        curr = this.head;
        let it = 0;

        // find the position by iterating
        while (it < index) {
          it++;
          prev = curr;
          curr = curr.next;
        }
        node.next = curr;
        prev.next = node;
      }
      this.count++;
    }
  }

  print(): void {
    let currentNode = this.head;
    while (currentNode !== null) {
      console.log(currentNode.value + " ->");
      currentNode = currentNode.next;
    }
  }
}

let ll = new LinkedList<number>();
ll.append(100);
ll.append(200);
ll.prepend(400);
console.log(ll.count);
ll.print();
