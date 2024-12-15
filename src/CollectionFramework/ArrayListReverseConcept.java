package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseConcept {

	public static void main(String[] args) {
		
		
		ArrayList<String> rev = new ArrayList<String>();
		
		rev.add("Ram");
		rev.add("Shyam");
		rev.add("Shalu");
		rev.add("Chanda");
		rev.add("Hello");
		rev.add("Hi");
		rev.add("Bye");
		//rev.add(null);   // java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "pivot" is null
		rev.add("Welcome");
		
		System.out.println(rev.size());
		System.out.println("ArrayList elements before sorting: " +rev);
		Collections.sort(rev);
		System.out.println("ArrayList elements after sorting: " +rev);
		Collections.sort(rev, Collections.reverseOrder());
		System.out.println("ArrayList elements after reversing the order : " +rev);
		
		Collections.shuffle(rev);
		System.out.println("ArrayList elements after shuffling the order : " +rev);
		
		
	}

}
