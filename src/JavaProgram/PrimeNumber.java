package JavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {

		// Prime number: It is a whole number greater than 1 and have only two factors 0
		// and the number itself
		// Prime number are divisible only by 1 and itself

		PrimeNumber prime = new PrimeNumber();
		boolean flag = prime.isPrime(10);
		System.out.println(flag);
		System.out.println(prime.isPrime(2));
		System.out.println(prime.isPrime(23));
		prime.getPrimeNumber(20 );
		prime.isPrime();

	}

	// Check the given number is prime or not
	public boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Find the total Prime number from the range
	public void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}System.out.println();
	}

	public void isPrime() {
		int num = 10;
		int temp = 0;
		if (num <= 1) {
			System.out.println("Not a prime number: " + num);
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				temp = temp + 1;
				System.out.println("Not a prime number: " + num);
				break;
			}
			if (temp == 0) {
				System.out.println("Given number is prime number: " + num);
			}
		}
	}
}
