package JavaAdvanceCode;

public class ReverseInteger {

	public static void main(String[] args) {
		
		ReverseInteger rv = new ReverseInteger();
		int reverse = rv.reverseInt(12345);
		System.out.println(reverse);
	}

	public int reverseInt(int num) {
		int rev =0;
		while(num !=0) {
			int temp = num%10;
			rev= rev*10+temp;
			num= num/10;
		}
		return rev;
	}
}
