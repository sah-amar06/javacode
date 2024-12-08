package JavaProgram;

public class Powerconcept {

	public static void main(String[] args) {
		
		
		System.out.println(Math.pow(5, 2));
		
		int base = 4;
		int expo = 4;
		long result = 1;
		
		while(expo !=0) {
			result = result*base;
			--expo;
		}
		System.out.println(result);
	}

}
