package CollectionFramework;

import java.util.HashSet;

public class HashSetCollections {

	public static void main(String[] args) {
		
		
		HashSet<Integer> evenNum = new HashSet<Integer>();
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		evenNum.add(8);
		evenNum.add(10);
		evenNum.add(12);
		evenNum.add(14);
		evenNum.add(20);
		
		System.out.println(evenNum); 		//[2, 4, 20, 6, 8, 10, 12, 14]

		
		HashSet<Integer> num = new HashSet<Integer>();
		num.addAll(evenNum);
		num.add(60);
		System.out.println(num);  		//[2, 4, 20, 6, 8, 10, 12, 60, 14]

		num.removeAll(evenNum);
		System.out.println(num); 		//[60]

	}

}
