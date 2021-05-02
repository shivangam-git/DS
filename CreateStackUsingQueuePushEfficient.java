package ds_programs;

public class CreateStackUsingQueuePushEfficient {
	// its main fun is in CreateStackUsingQueuePushEfficient class
	// this class use funcs of CreateQueueUsingLinkedList;
	private CreateQueueUsingLinkedList primary;// primary queue
	private CreateQueueUsingLinkedList secondary;// secondary queue

	CreateStackUsingQueuePushEfficient() {
		this.primary = new CreateQueueUsingLinkedList();
		this.secondary = new CreateQueueUsingLinkedList();

	}

	public boolean isEmpty() {
		return this.primary.isEmpty();// it will call function of CreateQueueUsingLL
	}

	public int size() {
		return this.primary.size();// it will call function of CreateQueueUsingLL
	}

	public void push(int data) {
		this.primary.enqueue(data);// """"""
	}

	public int pop() {
		while (this.primary.size() != 1)
			secondary.enqueue(primary.dequeue());// """""""
		int val = this.primary.dequeue();// element poped from stack
		while (this.secondary.size() != 0)
			primary.enqueue(secondary.dequeue());
		return val;
	}

	public int top() {
		while (this.primary.size() != 1)
			secondary.enqueue(primary.dequeue());
		int val = this.primary.dequeue();// element poped from stack
		this.secondary.enqueue(val);
		while (this.secondary.size() != 0)
			primary.enqueue(secondary.dequeue());
		return val;
	}

	public void display() {
		reverseQueue(primary);
		this.primary.display();// call display of CreateQueueUsingLL class
		reverseQueue(primary);// for maintaining order
	}

	private static void reverseQueue(CreateQueueUsingLinkedList queue) {
		if (queue.isEmpty())
			return;
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}
}
