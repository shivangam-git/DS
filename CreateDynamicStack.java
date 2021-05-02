package ds_programs;

public class CreateDynamicStack extends CreateStackByArrays {
	// make CreateStackByArrays data and top variable as protected
	public CreateDynamicStack() throws Exception {
		this(DEFAULT_CAPACITY);

	}

	public CreateDynamicStack(int capacity) throws Exception {
		super(capacity);// call CreateStackByArrays param constructor for creating array of size given
						// by user initially

	}

	// override push ()
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			int arr[] = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++)
				arr[i] = this.data[i];// copy elements from previous array to double sized array
			this.data = arr;// give double sized array reference to data array
		}
		super.push(item);// call push function of CreateStackByArrays class to add item
	}

}
