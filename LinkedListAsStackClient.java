package ds_programs;

public class LinkedListAsStackClient {
	// use LinkedListAsStack class here
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedListAsStack stack = new LinkedListAsStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();// 40 30 20 10-> act as a stack
		System.out.println(stack.size());// 4
		System.out.println(stack.isEmpty());// false
		System.out.println(stack.pop());// 40
		System.out.println(stack.top());// 30
		stack.display();// 30 20 10
		System.out.println(stack.size());// 3
	}

}
