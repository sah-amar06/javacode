package Practice;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		
			{
				int a=11, b=22, c;
				
				c = a + b + a++ + b++ + ++a + ++b;
				
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				
				System.out.println("***********");
				
				int i=0;
				i = i++ - --i + ++i - i--;

				System.out.println(i);
				
				System.out.println("***********");
				
				int k =1, l=2, m=3;
				
				int n = k-- - l-- - m--;
				System.out.println("k:" +k);
				System.out.println("l:" +l);
				System.out.println("m:" +m);
				System.out.println("n:" +n);
				
//				int xz = 10++;
//				
//				System.out.println(xz);
				
				char ch = 'A';
				System.out.println(++ch);
			}
		}

	}

