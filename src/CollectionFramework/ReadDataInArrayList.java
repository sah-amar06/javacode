package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadDataInArrayList {

	public static void main(String[] args) {
		
		ArrayList data = new ArrayList();
		
		data.add("Hello");
		data.add(100);
		data.add(10.99);
		data.add(true);
		data.add("Friend");
		data.add("Chanda");
		
		
		//1. Using for loop
		System.out.println("Using for loop......" );
		for(int i=0; i<data.size(); i++) {
			Object text = data.get(i);
			System.out.println(text);
		}
		
		//2. Using for each loop
		
		
		System.out.println("Using for each loop......" );
		for(Object e:data) {
			System.out.println(e);
		}
		
		
		//3. Iterator method
		System.out.println("Using Iterator method......" );
		
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			Object text = itr.next();
			System.out.println(text);
		}

	}

}
