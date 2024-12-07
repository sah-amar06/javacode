package Array;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		
		//Array literals we can use when we have data available with us
		int lit[] = {1,23, 24, 56, 78, 90};
		
		//lower index
		System.out.println("Lower index: " +0);
		//Highest index
		System.out.println("Highest index: " +(lit.length-1));
		
		//Length of an array
		System.out.println("Array length: " +(lit.length));
		
		System.out.println(Arrays.toString(lit));
		
		for(int li:lit)
		{
			System.out.println(li);
		}

	}

}
