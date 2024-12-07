package JavaProgram;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		if((ch>='a' && ch<='z') || ch>='A' && ch<='Z') {
			System.out.println(ch + " : is an alphabet");
		}else {
			System.out.println(ch + " : not an alphabet");
		} 

	}

}
