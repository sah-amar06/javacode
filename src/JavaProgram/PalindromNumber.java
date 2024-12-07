package JavaProgram;

public class PalindromNumber {

	public static void main(String[] args) {
		
		//Palindrom number: If the reversed number is same then the given number is Palindrom number
		
		isPalindrom(155);
		isPalindrom(1234554321);
	}
	
	public static void isPalindrom(int num) {
		int temp = num;
		int rem;
		int result = 0;
		while(num>0) {
			
			rem = num%10;   //get the remender of the given number
			result = (result*10)+rem;
			num = num/10; 	//Remove the remender/last digit from the given number
			
			
		}
		if(result==temp) {
			System.out.println("Palindrom number: " +temp);
		}
		else {
			System.out.println("Not a palindrom number: " +temp);
		}
	}

}
