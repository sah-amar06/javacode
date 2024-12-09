package JavaAdvanceCode;

import java.util.Arrays;

public class LargestAndSmallstNumber {

	public static void main(String[] args) {

		//int numbers[] = {10, -20, 9000, 99112, -82992, 900, 82712, 92882, -829283};
		//int numbers[] = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9};
		//int numbers[] = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
		//int numbers[] = {10};
		//int numbers[] = {0, 0};
		
		//Time complexicity: O(n)
		int numbers[] = {-1,-1};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest= numbers[i];
			}else if(numbers[i]<smallest) {
				smallest= numbers[i];
			}
		}
		System.out.println("Given array: " +Arrays.toString(numbers));
		System.out.println("Largest number: " +largest);
		System.out.println("Smallest number: " +smallest);
	}

}
