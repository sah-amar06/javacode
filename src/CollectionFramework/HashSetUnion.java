package CollectionFramework;

import java.util.HashSet;

public class HashSetUnion {

	public static void main(String[] args) {
		
		
		
		//Union, Intersection, difference
		
		HashSet<Integer> evenNum = new HashSet<Integer>();
		evenNum.add(1);
		evenNum.add(2);
		evenNum.add(3);
		evenNum.add(4);
		evenNum.add(5);
		evenNum.add(6);
		evenNum.add(7);
		evenNum.add(8);
		
		System.out.println("Even numbers: "+evenNum); 		//[2, 4, 20, 6, 8, 10, 12, 14]

		
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		num.add(11);
		System.out.println("Num: " +num); 	//[2, 18, 6, 22, 12]
		
		//Union: Unique elements from both the HashSet
		num.addAll(evenNum);
		System.out.println("Unique elements from both HashSet: "+num); 	//[2, 18, 4, 20, 6, 22, 8, 10, 12, 14]
		
		//Intersection: Common Elements from both the HashSet
		num.retainAll(evenNum);
		System.out.println("Common elements from both HashSet: " +num);  //[2, 4, 20, 6, 8, 10, 12, 14]
		
		//Difference
		//evenNum.removeAll(num);
		//System.out.println(evenNum);
		
		//Subset
		System.out.println(evenNum.containsAll(num));			//true

	}

}
