package Practice;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		
		int a = 205, b=78, c=87;
		
		if(a>b & a>c)
		{
			System.out.println("Greatest number is: " +a);
		}
		else if(b>a & b>c)
		{
			System.out.println("Greatest number is " +b);
		}
		else
		{
			System.out.println("Greatest number is: " +c);
		}

	}

}
