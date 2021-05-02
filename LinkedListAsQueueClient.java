package ds_programs;

public class LinkedListAsQueueClient {
	// use LLAQ class here
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedListAsQueue q = new LinkedListAsQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();// 10 20 30 40-> act as a queue
		System.out.println(q.size());// 4
		System.out.println(q.isEmpty());// false
		System.out.println(q.dequeue());// 10
		System.out.println(q.front());// 20
		q.display();// 20 30 40
		System.out.println(q.size());// 3
	}

}
