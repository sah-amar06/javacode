package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		

		//Declaration
		//1. Generic
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		//2. Implementing by Set
		//Set imp = new LinkedHashSet();
		
		//3. Restricting to specific data type
		
		//LinkedHashSet<String> rest = new LinkedHashSet<String>();
		
		//4. With Customized initial values and Load factor
		
		//LinkedHashSet custom = new LinkedHashSet(100, (float)0.9);
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		System.out.println(lhs);  //[100, 200, 300, 400]
		

	}

}
