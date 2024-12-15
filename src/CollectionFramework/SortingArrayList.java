package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		
		
		//We can only sort the homogeneous type of data types
		//To sort the ArrayList element we have to use Collections(Class)
		
		//Declarations of an ArrayList\
		
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('X');
		al.add('H');
		al.add('Y');
		al.add('C');
		al.add('K');
		al.add('O');
		al.add('Z');
		al.add('a');
		al.add('H');
		
		System.out.println("Elements in ArrayList before sorting: "+al);
		
		Collections.sort(al);
		System.out.println("Elements in ArrayList after sorting: "+al);
		
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements in ArrayList after sorting in reverse order : "+al);
		
		
		Collections.shuffle(al);
		System.out.println("Elements in ArrayList after shuffling : "+al);

	}

}
