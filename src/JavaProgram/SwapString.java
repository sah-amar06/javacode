package JavaProgram;

public class SwapString {

	public static void main(String[] args) {
		
		
		String a = "Hello";
		String b = "Bye";
		
		System.out.println("Before swapping the value of a: " +a);
		System.out.println("Before swapping the value of b: " +b);
		
		
		//Step 1: Concate
		a = a+b;
		System.out.println(a.length());
		
		//Step 2: Store initial String a in String b 
		//Using "substring()" : It will remove the character from the string from the given index number
		
		b = a.substring(0, a.length()-b.length());   // Here, The index will start from 0th and 
													//will remove the character from the ending index  (int beginIndex, int endIndex)
		
		
		//Step 3: Store initial String b in String a
		a = a.substring(b.length());
		
		
		System.out.println("After swapping the value of a: " +a);
		System.out.println("After swapping the value of b: " +b);
		

	}

}
