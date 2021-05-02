package ds_programs;

public class UseDynamicStack {

	public static void main(String[] args) throws Exception {
		CreateStackByArrays stack = new CreateDynamicStack(5);
		for (int i = 1; i <= 5; i++)
			stack.push(i * 10);
		// now stack is full

		stack.push(60);// dont give error bcz with this push new array is created of double size than
						// previous array
		stack.push(70);
		stack.push(80);
		stack.display();
	}

}
