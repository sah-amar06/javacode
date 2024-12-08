package JavaAdvanceCode;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		
		
		String s = "@#$%^amar&*#*nath*#*_!*!&@^&@sah";
		
		//Regular expression[^a-zA-Z1-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
