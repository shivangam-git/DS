package ds_programs;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateQueueUsingLinkedList queue = new CreateQueueUsingLinkedList();
		for (int i = 1; i <= 6; i++)
			queue.enqueue(i * 10);

		reverseQueue(queue);
		System.out.println("after reversing: ");
		while (!queue.isEmpty())
			System.out.println(queue.dequeue());
	}

	public static void reverseQueue(CreateQueueUsingLinkedList queue) {
		if (queue.isEmpty())
			return;
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}

}
