package JavaProgram;

public class SwapTwoInteger {

	public static void main(String[] args) {
		
		int x =10; 
		int y=20;
		
		//With temp variable
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swaping the number: " +x +" " +y);
		
		//Withot temp variable
		
		int a = 30;
		int b =90;
		
		a = a+b;  //120
		b = a-b;  //30
		a = a-b;  //90
		System.out.println("After swaping the number: " +a +" " +b);
		
		//With ^
		
		int ab = 45; 
		int ac = 70;
		
		ab = ab^ac;
		ac = ab^ac;
		ab = ab^ac;
		
		System.out.println("After swaping the number: " +ab +" " +ac);

	}

}
