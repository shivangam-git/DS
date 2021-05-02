package ds_programs;

import java.util.LinkedList;

public class CreateQueueUsingLinkedList {

	LinkedList<Integer> queue;

	CreateQueueUsingLinkedList() {
		queue = new LinkedList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();// use in built method of LL
	}

	public int size() {
		return this.queue.size();
	}

	public void enqueue(int data) {
		queue.addLast(data);// use in built method of LL
	}

	public int dequeue() {
		return queue.removeFirst();// use in built method of LL
	}

	public int getFront() {
		return queue.getFirst();// use in built method of LL
	}

	public void display() {
		System.out.println(queue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateQueueUsingLinkedList queue = new CreateQueueUsingLinkedList();
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
		queue.enqueue(100);
		System.out.println(queue.size());// 1
		queue.display();// 100
	}

}
