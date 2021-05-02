package ds_programs;

public class CreateLinkedListClient {
	// this class use the functions of CreateLL class
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CreateLinkedList list = new CreateLinkedList();
		/*
		 * list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40);
		 * list.addLast(50); list.display(); // 10 20 30 40 50 System.out.println();
		 * System.out.println("-------------------");
		 */
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);
		list.display();// 50 40 10 20 30
		System.out.println("------------------");
		System.out.println(list.getAt(2));// 10
		System.out.println(list.getFirst());// 50
		System.out.println(list.getLast());// 30
		list.addAt(3, 60);
		list.display();// 50 40 10 60 20 30
		System.out.println("----------------------");
		System.out.println(list.removeFirst());// 50
		list.display();// 40 10 60 20 30
		System.out.println("------------------------");
		System.out.println(list.removeLast());/// 30
		list.display();// 40 10 60 20
		System.out.println("-----------------------");
		System.out.println(list.removeAt(1));// 10
		list.display();// 40 60 20
		list.addFirst(100);
		System.out.println("-----------");
		list.display();// 100 40 60 20
		list.reverseData();// 20 60 40 100
		System.out.println("after reversing data");
		list.display();//// 20 60 40 100
		System.out.println("after reversing pointers");
		list.reversePointers();// 100 40 60 20
		list.display();// 100 40 60 20

		System.out.println(list.mid());// 40
		System.out.println("---------------------");
		list.display();// 100 40 60 20
		System.out.println(list.kthNodeFromEnd(2));// 60

	}

}
