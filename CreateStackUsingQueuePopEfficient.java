package ds_programs;

public class CreateStackUsingQueuePopEfficient {

	// its main fun is in CreateStackUsingQueuePopEfficient class
	// this class use funcs of CreateQueueUsingLinkedList;
	private CreateQueueUsingLinkedList primary;// primary queue
	private CreateQueueUsingLinkedList secondary;// secondary queue

	CreateStackUsingQueuePopEfficient() {
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
		while (this.primary.size() != 0)
			this.secondary.enqueue(this.primary.dequeue());// """""""
		this.primary.enqueue(data);
		while (this.secondary.size() != 0)
			this.primary.enqueue(this.secondary.dequeue());

	}

	public int pop() {
		return this.primary.dequeue();
	}

	public int top() {
		return this.primary.getFront();// it will call function of CreateQueueUsingLL
	}

	public void display() {
		this.primary.display();// call display of CreateQueueUsingLL class

	}

}
