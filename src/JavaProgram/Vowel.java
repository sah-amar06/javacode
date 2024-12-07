package JavaProgram;

public class Vowel {

	public static void main(String[] args) {
		boolean flag = isVowel('x');
		System.out.println(flag);

		char ch = 'a';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is consonent");
		}

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Character is vowel");
			break;

		default:
			System.out.println("Character is consonent");
			break;
		}

	}

	public static boolean isVowel(char ch1) {
		if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
			return true;
		} else {
			return false;
		}
	}

}
