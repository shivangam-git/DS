package ds_programs;

// USE THIS CLASS IN UseStackUsingArrayByClient.java
public class CreateStackByArrays {

	protected int data[];
	protected int top;
	public static final int DEFAULT_CAPACITY = 10;

	public CreateStackByArrays() throws Exception {
		this(DEFAULT_CAPACITY);// pass value to lower constructor if user don't give any capacity
	}

	public CreateStackByArrays(int capacity) throws Exception {
		if (capacity < 1)
			throw new Exception("Invalid Capacity");
		this.data = new int[capacity];// initialize array with capacity
		this.top = -1;
	}

	public int size() {// size of array
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int value) throws Exception {
		if (this.size() == this.data.length)
			throw new Exception("Stack is Full");
		this.top++;
		this.data[this.top] = value;

	}

	public int pop() throws Exception {
		if (this.top == -1)
			throw new Exception("Stack is Empty");
		int cval = this.data[this.top];
		this.top--;
		return cval;
	}

	public int top() throws Exception {
		if (this.top == -1)
			throw new Exception("Stack is Empty");
		int cval = this.data[this.top];
		return cval;

	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}
	// USE THIS CLASS IN UseStackUsingArrayByClient.java

}
