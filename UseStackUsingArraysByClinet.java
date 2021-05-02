package ds_programs;

public class UseStackUsingArraysByClinet {
	// USE CreateStackClassByArrays class
	public static void main(String[] args) throws Exception {

		CreateStackByArrays stack = new CreateStackByArrays(5);
		// pushing elements
		for (int i = 1; i <= 5; i++)
			stack.push(i * 10);// 10 20 30 40 50
		System.out.println("displaying elements after pushing");
		stack.display();
		// stack.push(60);// error- stack is full
		System.out.println("retrieve topmost element:" + stack.pop());
		System.out.println("displaying elements after pop");
		stack.display();
		System.out.println("display element on top of stack:" + stack.top());
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		// System.out.println(stack.pop());// error- stack is empty
	}

}
