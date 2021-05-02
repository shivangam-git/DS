package ds_programs;

public class CreateStackUsingQueuePushEfficientClient {
	// CreateStackUsingQueuePushEfficient class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateStackUsingQueuePushEfficient stack = new CreateStackUsingQueuePushEfficient();
		for (int i = 1; i <= 6; i++)
			stack.push(i * 10);// 10 20 30 40 50 60// it now act as a queue
		stack.display();// 60 50 40 30 20 10// bcz we reverse the queue
		System.out.println(stack.pop());// 60
		stack.display();// 50 40 30 20 10
		System.out.println(stack.top());// 50
		stack.display();// 50 40 30 20 10

	}

}
