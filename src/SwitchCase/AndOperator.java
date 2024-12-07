package SwitchCase;

public class AndOperator {

	public static void main(String[] args) {
		
		
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = false;
		boolean b4 = true;
		
		
		//AND &
		if(b1 & b2 & b3 & b4)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Bye");
		}
		
		//short circuit &&
		
		if(b1 && b2 && b3 && b4)
		{
			System.out.println("hii");
		}
		System.out.println("Bye!!");
		
	}

}
