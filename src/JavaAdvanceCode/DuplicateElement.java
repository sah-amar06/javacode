package JavaAdvanceCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		
		String names[] = {"Ram", "Shyam", "Tom", "Ram", "Mohan", "Neeta", "Neeta"};
		
		//Approach 1: Compare each element using for loop
		//Time complexicity : O(nxn)
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element: " +names[j]);
				}
			}
		}
		//Approach 2: Using HashSet
		//Time complexicity: O(n)
		System.out.println("Using HasHSet");
		Set<String> store  = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)== false) {
				System.out.println("Duplicate element: " +name);
			}
		}
		
	}

}
