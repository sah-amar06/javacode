package Array;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object obj[] = new Object[4];
		//Defalt value of Object	: null
		
		System.out.println(Arrays.toString(obj));
		
		obj[0] = "Amar";
		obj[1] = 29;
		obj[2] = 'M';
		obj[3] = true;
		System.out.println(Arrays.toString(obj));
		
		
	}

}
