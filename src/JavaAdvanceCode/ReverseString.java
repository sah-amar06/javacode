package JavaAdvanceCode;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Welcome";

		name = name.trim();
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("Using StringBuffer...");
		String s = "Selenium";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		System.out.println("Using StringBuilder....");
		
		String s1 = "Chanda";
		StringBuilder sbr = new StringBuilder(s1);
		System.out.println(sbr.reverse());
	}
	

}
