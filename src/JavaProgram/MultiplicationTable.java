package JavaProgram;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		multiplicationTable(12);
		int num = 10;
		
		for(int i=1; i<=num; i++) {
			System.out.println(num + "X" + i + "=" +(num*i));
		}

	}
	
	public static void multiplicationTable(int num) {
		
		for(int i =1; i<=10; i++) {
			System.out.println(num + "X" + i + "=" +(num*i));
		}
	}

}
