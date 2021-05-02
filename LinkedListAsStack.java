package ds_programs;

public class LinkedListAsStack {
	// use CreateLinkedList class here
	private CreateLinkedList stack;

	LinkedListAsStack() {
		this.stack = new CreateLinkedList();
	}

	public int size() {
		return this.stack.size();// call func of CLL class

	}

	public boolean isEmpty() {
		return this.stack.isEmpty();// call func of CLL class
	}

	public void push(int data) {
		this.stack.addFirst(data);// call func of CLL class
	}

	public int pop() throws Exception {
		return this.stack.removeFirst();// call func of CLL class
	}

	public int top() throws Exception {
		return this.stack.getFirst();// call func of CLL class
	}

	public void display() {
		this.stack.display();// call func of CLL class
	}

}
