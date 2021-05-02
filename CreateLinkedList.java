package ds_programs;

public class CreateLinkedList {
	private class Node {
		int data;
		Node next;
	}

	// instance var of CreateLL class
	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	// traversing LL
	// o(n)
	public void display() {
		Node temp = this.head; // here this means class variables
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// o(1)
	public void addLast(int item) {
		Node nn = new Node();// create new node
		nn.data = item;
		nn.next = null;

		// update object summary
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail.next = nn;// give previous node the address of newly added node
			this.tail = nn;// updating tail
			this.size++;
		}

	}

	// o(1)
	public void addFirst(int item) {
		// create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach newly added node to the previous node
		if (this.size >= 1) {
			nn.next = head;
		}
		// update object summary
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;// updating head
			this.size++;
		}
	}

	// o(1)
	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		return this.head.data;// pointing to first node
	}

	// o(1)
	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		return this.tail.data;// pointing to last node
	}

	// o(n)
	public int getAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		if (index < 0 || index >= this.size)
			throw new Exception("Invalid index");
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	// o(n)
	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		if (index < 0 || index >= this.size)
			throw new Exception("Invalid index");
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;// give address of ith node
	}

	// o(n)
	public void addAt(int index, int item) throws Exception {
		if (index < 0 || index > this.size)// we dont use >= bcz = means we want to add node at last
			throw new Exception("Invalid index");
		if (index == 0)
			addFirst(item);// add node at first
		else if (index == this.size)
			addLast(item);// add element at last
		else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			// attach new node
			Node nm1 = getNodeAt(index - 1);// call getNodeAt() func
			Node np1 = getNodeAt(index);
			nm1.next = nn;// assign address of new node to previous node
			nn.next = np1;// assign address of ith node to new node
			// update object
			this.size++;
		}
	}

	// o(1)
	public int removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		int val = this.head.data; // data of first node
		if (this.size == 1) { // if there is only one node
			this.head = null;
			this.tail = null;
			this.size = 0;

		} else {
			this.head = this.head.next;
			this.size--;
		}
		return val;

	}

	// o(n)
	public int removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		int val = this.tail.data; // data of first node
		if (this.size == 1) { // if there is only one node
			this.head = null;
			this.tail = null;
			this.size = 0;

		} else {
			Node nm1 = getNodeAt(this.size - 2);// nm1 = nodeminus1...... it will give the adddress of second lst node
			this.tail = nm1;// make second last node as tail i.e. last node
			this.tail.next = null;// update next of 2nd last node to null bcz now it become last node
			this.size--;
		}

		return val;

	}

	// o(n)
	public int removeAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");
		if (index < 0 || index >= this.size)
			throw new Exception("INvalid index");
		if (index == 0)
			return removeFirst();
		else if (index == this.size - 1)
			return removeLast();
		else {
			Node nm1 = getNodeAt(index - 1);// previous node of deleting node
			Node n = getNodeAt(index);// or nm1.next.... deleting node
			Node np1 = getNodeAt(index + 1);// or n.next..... next node of deleting node
			nm1.next = np1;// assign address of next node of deleting node to the previous node
			this.size--;
			return n.data;
		}

	}

	// o(n)
	// this method work for both even and odd no of nodes
	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			// swapping the data
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
	}

	// o(n)
	public void reversePointers() {
		Node prev = this.head;// pointing to first node
		Node curr = prev.next;// poinitng to 2nd node
		while (curr != null) {
			Node ahead = curr.next;// poinintg to node which is next to curr node
			curr.next = prev;// assign address of previous node to the next node to make it reverse
			// move pointers to next nodes
			prev = curr;
			curr = ahead;
		}
		// swap tail and head bcz now tail points to first node of original ll
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		// update tail
		this.tail.next = null;
	}

	// o(n)
	public int mid() {
		Node slow = this.head;// pointing to first node
		Node fast = this.head;// " " " "
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;// move by 1 position
			fast = fast.next.next;// move by 2 positions
		}
		return slow.data;// return mid node data
	}

	public int kthNodeFromEnd(int k) throws Exception {
		if (k <= 0 || k > this.size)
			throw new Exception("Invalid value of k");
		Node slow = this.head;
		Node fast = this.head;
		for (int i = 1; i <= k; i++)// create k difference between slow and fast
			fast = fast.next;
		while (fast != null) {// when fast reaches null automatically slow points to kth node from end bcz of
								// k difference which we created using for loop
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

}
