package ds_programs;

public class CreateCircularArrayQueue {

	private int arr[];
	private int front;
	private int rear;
	private int curr_size;
	private int max_size;
	public static final int DEFAULT_CAPACITY = 10;

	CreateCircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	CreateCircularArrayQueue(int capacity) {
		this.arr = new int[capacity];
		this.curr_size = 0;
		this.max_size = capacity;
		this.front = 0;
		this.rear = this.arr.length - 1;
	}

	public boolean isFull() {
		return this.curr_size == this.max_size;
	}

	public boolean isEmpty() {
		return this.curr_size == 0;
	}

	public void enqueue(int data) {
		if (!this.isFull()) {
			this.rear = (this.rear + 1) % this.arr.length;
			this.arr[this.rear] = data;
			this.curr_size = this.curr_size + 1;
		}
	}

	public void dequeue() {
		if (!this.isEmpty()) {
			this.front = (this.front + 1) % this.arr.length;
			this.curr_size--;
		}
	}

	public int getFront() {
		return this.arr[this.front];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateCircularArrayQueue queue = new CreateCircularArrayQueue(5);
		for (int i = 1; i <= 5; i++)
			queue.enqueue(i);
		queue.dequeue();// delete 1
		queue.dequeue();// delete 2
		queue.enqueue(30);// add 30 after 5
		while (!queue.isEmpty()) {
			System.out.println(queue.getFront());
			queue.dequeue();
		}
		System.out.println("after dequeue all elements  and enqueue new elements");
		queue.enqueue(40);
		while (!queue.isEmpty()) {
			System.out.println(queue.getFront());
			queue.dequeue();
		}
	}

}
