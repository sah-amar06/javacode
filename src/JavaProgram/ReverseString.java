package JavaProgram;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString reverse = new ReverseString();
		String name = reverse.isReverse("  Hello  ");
		System.out.println(name);

		// Using StringBuffer
		String s1 = "Selenium";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		//Using StringBuilder
		String s2 = "Java";
		StringBuilder sbr = new StringBuilder(s2);
		System.out.println(sbr.reverse());
		
	}

	public String isReverse(String s) {

		s = s.trim();
		String rev = "";
		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		return rev;
	}
}
