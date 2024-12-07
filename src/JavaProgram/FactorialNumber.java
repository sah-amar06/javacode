package JavaProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial number:Product of multiplication of all integres smaller than or equal to that number
		
		FactorialNumber fact =  new FactorialNumber();
		System.out.println(fact.isFactorial(5));
	}
	
	
	public int isFactorial(int num) {
		int fact =1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
