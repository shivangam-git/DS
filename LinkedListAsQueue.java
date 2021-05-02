package ds_programs;

public class LinkedListAsQueue {
	// use CreateLinkedList class in this class
	private CreateLinkedList queue;

	public LinkedListAsQueue() {
		this.queue = new CreateLinkedList();
	}

	public int size() {
		return this.queue.size();// call func of CLL class

	}

	public boolean isEmpty() {
		return this.queue.isEmpty();// call func of CLL class
	}

	public void enqueue(int data) {
		this.queue.addLast(data);// call func of CLL class
	}

	public int dequeue() throws Exception {
		return this.queue.removeFirst();// call func of CLL class
	}

	public int front() throws Exception {
		return this.queue.getFirst();// call func of CLL class
	}

	public void display() {
		this.queue.display();// call func of CLL class
	}
}
