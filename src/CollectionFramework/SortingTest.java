package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<String>();
		
		names.add("Jithin");
		names.add("Arunima");
		names.add("Akhil");
		names.add("Matthew");
		names.add("Benjamin");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		

	}

}
