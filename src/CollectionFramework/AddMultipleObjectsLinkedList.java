package CollectionFramework;

import java.util.LinkedList;

public class AddMultipleObjectsLinkedList {

	public static void main(String[] args) {
		
		LinkedList test = new LinkedList();

		test.add("Hello");
		test.add(100);
		test.add(10.88);
		test.add(true);
		test.add('A');
		test.add("Ram");
		test.add('B');
		test.add(null);
		test.add(null);
		
		LinkedList test1 = new LinkedList();
		
		test1.addAll(test);
		
		System.out.println(test1);
		
		test1.removeAll(test);
		System.out.println(test1);
		System.out.println(test);

	}

}
