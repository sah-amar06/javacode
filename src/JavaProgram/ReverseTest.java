package JavaProgram;

public class ReverseTest {

	public static void main(String[] args) {

		String name = "Selenium    Test";

		String split[] = name.split("\\s+");
		String reverse = "";
		
		for(String e:split) 
		{
			String rev = "";
			for(int i=e.length()-1; i>=0; i--)
			{
				rev = rev+e.charAt(i);
			}
			reverse = reverse +rev +" ";
		}
		System.out.println(reverse);
	}
}
