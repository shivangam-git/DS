package ds_programs;

public class CreateQueueUsingStacksEnqueueEfficient {
	// its main function is in CreateQueueUsingStacksEnqueueEfficientClient class
	// use CreateDynamicStack class here and its functions also
	private CreateDynamicStack primary;
	private CreateDynamicStack secondary;

	CreateQueueUsingStacksEnqueueEfficient() throws Exception {
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
		this.primary.push(data);// it will call function of CreateDynamicStack
	}

	public int dequeue() throws Exception {
		while (this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());// it will call function ofCreateDynamicStack
		}
		int val = this.primary.pop();
		while (!this.secondary.isEmpty())
			this.primary.push(this.secondary.pop());
		return val;
	}

	public int front() throws Exception {
		while (this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());// it will call function of CreateDynamicStack
		}
		int val = this.primary.top();
		while (!this.secondary.isEmpty())
			this.primary.push(this.secondary.pop());
		return val;
	}

	public void display() throws Exception {
		reverseStack(primary, secondary, 0);
		primary.display();
		reverseStack(primary, secondary, 0);// for maintaining order
	}

	private static void reverseStack(CreateDynamicStack stack, CreateDynamicStack helper, int index) throws Exception {
		if (stack.isEmpty())
			return;
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);// after pushing all values my helper be like: 50 40 30 20 10
		if (index == 0) {
			while (!helper.isEmpty())
				stack.push(helper.pop());

		}

	}

}
