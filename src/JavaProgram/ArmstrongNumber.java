package JavaProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isArmstrong(15));
		System.out.println(isArmstrong(153));
		
	}

	public static boolean isArmstrong(int num) {
		int result = 0;
		int temp = num;
		int rem;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = result + (rem * rem * rem);
		}
		if (result == temp) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
