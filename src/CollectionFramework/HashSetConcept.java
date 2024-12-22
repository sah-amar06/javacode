package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
		
		//Declaration of the HashSet
		//1. generic declaration
		//HashSet hs = new HashSet();  //Dafault capacity 16 & Loadfactor 0.75
		
		//2. Implementing from Set Interface
		//Set hs1 = new HashSet();
		
		//Restrictin to Specific datatype
		
		//HashSet<String> lim = new HashSet<String>();
		
		//Adding elemets to HashSet
		
		HashSet hs = new HashSet(100,(float) 0.9);
		hs.add("Ram");
		hs.add("Shyam");
		hs.add(100);
		hs.add(10.99);
		hs.add(true);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		System.out.println(hs); 	//null, 10.99, A, Shyam, 100, Ram, true]
		
		//Removing an existing element
		hs.remove(null);
		System.out.println(hs);  	//[10.99, A, Shyam, 100, Ram, true]
		
		System.out.println(hs.contains("Ram"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Shyam"));
		
		
		//Reading element from HashSet by loop
		
		for(Object e: hs) {
			System.out.println(e);
			 
		}
		
		//Reading the elements by Iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
