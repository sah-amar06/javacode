package JavaProgram;

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		int num = 10;
		int sum =0;
		
		for(int i=1; i<=num; i++) {
			sum =sum+i;
		}
		System.out.println(sum);
		
		int k = 1;
		int sum1 = 0;
		
		while(k<=num) {
			sum1 = sum1+k;
			k++;
		}
		System.out.println(sum1);

	}

}
