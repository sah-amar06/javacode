package JavaProgram;

public class CountDigits {

	public static void main(String[] args) {
		
		countDigits(1);
		countDigits(0);
		int num =12234;
		int count = 0;
		
		while(num!=0) {
			num= num/10;
			++count;
		}
		System.out.println("Total numbers: " +count );
	}

	
	public static void countDigits(int num) {
		int count=0;
		while(num!=0) {
			num = num/10;
			++count;
		}
		System.out.println("Total numbers: " +count );
	}
}
