package JavaProgram;

public class PrimeNumberBetweenInterval {

	public static void main(String[] args) {

		int start = 10;
		int end = 70;

		while (start < end) {

			boolean flag = false;
			for (int i = 2; i < start/2 ; i++) {
				if (start % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Prime numbers: " +start);
			}
			start++;
		}
	}
}
