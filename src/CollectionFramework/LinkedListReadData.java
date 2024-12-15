package CollectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReadData {

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

		// By for each loop
		for (Object e : test) {
			System.out.println(e);
		}

		// By using iterator method

		System.out.println("Using iterator method.....");
		Iterator it = test.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("By using for loop....");
		Object text[] = test.toArray();
		for (int i = 0; i < test.size(); i++) {
			text = test.toArray();
			
		}
		System.out.println(Arrays.toString(text));
	}

}
