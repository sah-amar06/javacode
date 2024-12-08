package JavaAdvanceCode;

public class MissingNumber {

	public static void main(String[] args) {

		// Logic
		// int a[] = {1,2,3,4,5,6,7,8,9,10};
		// 1+2+3+4+5+6+7+8+9+10= 55
		// int a[] = {1,2,3,4,5,7,8,9,10};
		// 1+2+3+4+5+6+7+8+9+10= 49
		// Missing number= 55-49=6
		
		//If array contains -(negative numbers in sequence the we have to start our 2nd loop 
		//from the smallest number (i.e. if -5,-4,-3,-2,-1,0,1,2: then loop start from -5)

		//int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int a[] = { -1,0,1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int sum1 = 0;

		for (int j = -1; j <= 10; j++) {
		//for (int j = 1; j <= 10; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("Missing number is: " + (sum1 - sum));
	}

}
