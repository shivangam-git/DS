package ds_programs;

public class CreateQueueUsingStacksDequeueEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CreateQueueUsingStacksDequeueEfficient queue = new CreateQueueUsingStacksDequeueEfficient();
		for (int i = 1; i <= 5; i++)
			queue.enqueue(i * 10);// 50 40 30 20 10 this order bcz it now act as a stack
		queue.display();// 10 20 30 40 50
		System.out.println(queue.dequeue());// 10
		queue.display();// 20 30 40 50
		System.out.println(queue.front());// 20
		queue.display();// 20 30 40 50

	}

}
