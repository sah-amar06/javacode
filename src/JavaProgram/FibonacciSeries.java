package JavaProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Fibonacci number: Next number is the sum of previous two numbers
		
		isFibonacci(20);
		

	}
	
	public static void isFibonacci(int num) {
		int temp = 0;
		int temp1= 1;
		int sum;
		System.out.print(temp + "," +temp1);
		for(int i=2; i<num; i++) {
			sum= temp+temp1;
			System.out.print(", " +sum);
			temp = temp1;
			temp1 = sum;
		}
		
	}

}
