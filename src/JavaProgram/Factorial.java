package JavaProgram;

public class Factorial {

	public static void main(String[] args) {
		
		isFactorial(6);
		isFactorial(0);
		
		int num = 5;
		int fact = 1;
		
		for(int i =1; i<=num; i++) {
			fact = fact*i;
		}

		System.out.println("Factorial of num: " +fact);
	}

	
	public static void isFactorial(int num) {
		
		int fact = 1;
		
		for(int i =1; i<= num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of num: " +fact);
	}
	
}
