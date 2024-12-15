package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		//Declaration LinkedList
		
		//1. Generic way
		LinkedList test = new LinkedList();
		
		//2. Restict to specific data type
		//LinkedList<String> test = new LinkedList<String>();
		
		//3. implementing from List(I)
		//List imp = new LinkedList();
		
		
		//Adding elements to the LinkedList
		
		test.add("Hello");
		test.add(100);
		test.add(10.88);
		test.add(true);
		test.add('A');
		test.add("Ram");
		test.add('B');
		test.add(null);
		test.add(null);
		
		//Get the size of the LinkedList
		
		System.out.println(test.size());
		
		//remove an element 
		test.remove();		//This method will remove the first element from the linkedList
		System.out.println(test.size());
		System.out.println(test);
		
		//remove an element by values
		test.remove(Character.valueOf('A'));
		System.out.println("After removing a specific value: " +test);
		
		//Remove an element by index
		test.remove(4);
		System.out.println("After removing element by index: " +test);
		
		//Insert an element in the specific place in the LinkedList
		test.add(5, "Anjali");
		System.out.println("After inserting an element in the middle of the LinkedList: " +test);
		
		//Retriving the value
		
		System.out.println(test.get(5));
		Object obj = test.get(5);
		System.out.println(obj);
		
		//Update the existing value
		test.set(4, "Amar");
		System.out.println("After updating the existing values: " +test);
		
		//Verify the element is available or not in LinkedList
		boolean flag = test.contains("Anjali");
		System.out.println(flag);
		
		
		//Verify the LinkedList is empty or not
		
		System.out.println(test.isEmpty());
	}

}
