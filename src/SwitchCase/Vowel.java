package SwitchCase;

public class Vowel {

	public static void main(String[] args) {
		
		char ch ='x';
		String result ="";
		
		result = switch(ch)
				{
				case 'a' -> "is a vowel";
				case 'e' -> "is a vowel";
				case 'i' -> "is a vowel";
				case 'o' -> "is a vowel";
				case 'u' -> "is a vowel";
				
				default -> "is a consonent ";
				};
		
		System.out.println(ch+ " " +result);
		

	}

}
