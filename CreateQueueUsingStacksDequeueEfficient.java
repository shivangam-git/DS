package ds_programs;

public class CreateQueueUsingStacksDequeueEfficient {
	// its main function is in CreateQueueUsingStacksDequeueEfficientClient class
	// use CreateDynamicStack class here and its functions also
	private CreateDynamicStack primary;
	private CreateDynamicStack secondary;

	CreateQueueUsingStacksDequeueEfficient() throws Exception {
		primary = new CreateDynamicStack();
		secondary = new CreateDynamicStack();

	}

	public boolean isEmpty() {
		return this.primary.isEmpty();// it will call function of CreateDynamicStack
	}

	public int size() {
		return this.primary.size();// it will call function of CreateDynamicStack
	}

	public void enqueue(int data) throws Exception {
		while (!primary.isEmpty())
			secondary.push(primary.pop());
		primary.push(data);
		while (!secondary.isEmpty())
			primary.push(secondary.pop());
	}

	public int dequeue() throws Exception {
		return this.primary.pop();
	}

	public int front() throws Exception {
		return this.primary.top();
	}

	public void display() {
		this.primary.display();
	}

}
