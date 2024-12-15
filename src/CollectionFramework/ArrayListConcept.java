package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//Declaring an ArrayList
		
		//1. Restricting to store only homogeneous data
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		//2. Hetrogeneous data storing inside ArrayList
		ArrayList al = new ArrayList();
		
		//3. Implementing from List(I)
		//List imp = new ArrayList();
		
		//Verify the ArrayList is Empty or not
		System.out.println(al.isEmpty());
		//Add elements to ArrayList
		
		al.add("Ram");
		al.add(100);
		al.add('A');
		al.add(100.8);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		//Find the length of the ArrayList
		System.out.println("Length of the ArrayList: "+al.size());
		
		//Remove existing element from the ArrayList
		al.remove(3);
		System.out.println("After removing element from the ArrayLits: "+al);
		al.remove(Character.valueOf('A'));
		System.out.println("After removing element from the ArrayLits: "+al);
		
		//Add an element in the middle of the ArrayList
		al.add(2, "Sita");
		System.out.println("After Adding an element in between of the ArrayLits: "+al);
		
		//Retrieve the value from the ArrayList
		System.out.println(al.get(2));
		
		
		//Replace an element
		al.set(2, "Hello");
		System.out.println("After replacing the existing element with new element: " +al);
		
		//Search/verify the element is present in ArrayList or not
		System.out.println("The element is available: " +al.contains("Hello"));
		System.out.println("The element is available: " +al.contains("Jai"));
		
		
		//Adding collection of the element
		List test = new ArrayList();
		test.add("Shalu");
		test.add(24);
		test.add(23.9);
		test.add(true);
		al.addAll(test);
		System.out.println("After Adding collection in the existing ArrayLits: "+al);

	}

}
