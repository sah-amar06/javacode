package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListreverse {

	public static void main(String[] args) {
		
		LinkedList test = new LinkedList();
		
		test.add('B');
		test.add('M');
		test.add('L');
		test.add('J');
		test.add('I');
		test.add('O');
		test.add('P');
		test.add('T');
		test.add('X');
		test.add('A');
		test.add('Z');
		
		
		System.out.println("Before revering..");
		System.out.println(test);
		
		 Collections.reverse(test);
		 System.out.println("After reversing..");
		 System.out.println(test);
		 
		 
		 System.out.println("before sorting");
		 System.out.println(test);
		 System.out.println("After sorting");
		 Collections.sort(test);
		 System.out.println(test);
		 
		 System.out.println("before shuffling");
		 System.out.println(test);
		 System.out.println("After shuffling");
		 Collections.shuffle(test);
		 System.out.println(test);
		 
		 System.out.println("Before reversing order..");
		 System.out.println(test);
		 System.out.println("After reversing order..");
		 Collections.sort(test, Collections.reverseOrder());
		 System.out.println(test);

	}

}
