class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  append(value) {
    let newNode = new Node(value);
    if (this.head === null) {
      this.head = newNode;
      this.size++;
      return;
    }
    let currentNode = this.head;
    while (currentNode.next !== null) {
      currentNode = currentNode.next;
    }

    currentNode.next = newNode;
    this.size++;
  }
  prepend(value) {
    let newNode = new Node(value);
    if (!this.head) {
      this.head = newNode;
      this.size++;
      return;
    }

    newNode.next = this.head;
    this.head = newNode;
    this.size++;
  }
  print() {
    if (this.head === null) {
      throw new Error("The linked list is empty.");
      return;
    }
    let currentNode = this.head;
    while (currentNode !== null) {
      console.log(currentNode.value);
      currentNode = currentNode.next;
    }
  }
  insertAt(element, index) {
    if (index < 0 && index > this.size) {
      console.log(`The index is valid.`);
      return;
    } else {
      let node = new Node(element);
      let curr, prev;
      curr = this.head;
      if (index === 0) {
        node.next = this.head;
        this.head = node;
      } else {
        curr = this.head;
        let it = 0;

        // iterate over the list to find
        // the position to insert

        while (it < index) {
          it++;
          prev = curr;
          curr = curr.next;
        }
        // adding an element
        node.next = curr;
        prev.next = node;
      }
      this.size++;
    }
  }

  removeFrom(index) {
    if (index < 0 || index >= this.size) {
      return console.log(`Please enter a valid index.`);
    } else {
      let curr,
        prev,
        it = 0;
      curr = this.head;
      prev = curr;

      // deleting first element
      if (index === 0) {
        this.head = curr.next;
      } else {
        // iterate over the list to the
        // position to remove an element
        while (it < index) {
          it++;
          prev = curr;
          curr = curr.next;
        }
        // remove the element
        prev.next = curr.next;
      }
      this.size--;
      // return the removed element
      return curr.element;
    }
  }

  removeElement(element) {
    let current = this.head;
    let prev = null;

    while (current !== null) {
      if (current.value === element) {
        if (prev === null) {
          this.head = current.next;
        } else {
          prev.next = current.next;
        }
        this.size--;
        return current.value;
      }
      prev = current;
      current = current.next;
    }
  }
}

let ll = new LinkedList();
ll.append(100);
ll.append(200);
ll.append(300);
ll.insertAt(`inserted`, 2);
console.log(`The size is ${ll.size}.`);
ll.print();
ll.removeFrom(2);
console.log(`---print after removal---`);
ll.print();
ll.removeElement(300);
console.log(`---print after removal---`);
ll.print();

// class Node {
//   constructor(data) {
//     this.data = data;
//     this.next = null;
//   }
// }

// class LinkedList {
//   cosntructor() {
//     this.head = null;
//     this.size = 0;
//   }

//   append(value) {
//     let newNode = new Node(value);
//     if (this.head === null) {
//       this.head = newNode;
//       this.size++;
//       return;
//     }
//     let currentNode = this.head;
//     while (currentNode.next !== null) {
//       currentNode = currentNode.next;
//     }

//     currentNode.next = newNode;
//     this.size++;
//   }

//   prepend(value) {
//     let newNode = new Node(value);
//     if (!this.head) {
//       this.head = newNode;
//       this.size++;
//       return;
//     }
//     newNode.next = this.head;
//     this.head = newNode;
//     this.size++;
//   }
//   isEmpty() {
//     if (this.size === 0) {
//       return true;
//     }
//   }

//   putAt(index, value) {
//     let newNode = new Node(value);
//     if (this.isEmpty()) {
//       console.log(`The Linked List is empty.`);
//       return;
//     }
//     if (index < 0 && index > this.size) {
//       console.log(`The index is valid. Please enter a valid index.`);
//       return;
//     }
//     if (index === 0) {
//       this.size++;
//       this.prepend(newNode);
//       return;
//     }
//     if (index === this.size) {
//       this.size++;
//       this.append(newNode);
//       return;
//     }
//     let it = 0;
//     let prev = null;
//     let curr = this.head;
//     while (it < index) {
//       it++;
//       prev = curr;
//       curr = curr.next;
//     }
//     prev.next = newNode;
//     newNode.next = curr;
//     this.size++;
//   }

//   print() {
//     if (this.isEmpty()) {
//       console.log(`The linked list is empty.`);
//       return;
//     }
//     let current = this.head;
//     while (current !== null) {
//       console.log(current.data);
//       current = current.next;
//     }
//   }
// }

// let ll = new LinkedList();
// ll.append(100);
// ll.append(200);
// ll.prepend(300);
// ll.print();
