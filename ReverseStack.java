package ds_programs;

public class ReverseStack {
	// Use CreateStackByArrays class
	public static void main(String[] args) throws Exception {
		CreateStackByArrays stack = new CreateStackByArrays(5);
		CreateStackByArrays helper = new CreateStackByArrays(5);
		// push elements in stack
		for (int i = 1; i <= 5; i++)
			stack.push(i * 10);
		stack.display();
		reverseStack(stack, helper, 0);
		System.out.println("after reversing:");
		stack.display();
	}

	public static void reverseStack(CreateStackByArrays stack, CreateStackByArrays helper, int index) throws Exception {
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
