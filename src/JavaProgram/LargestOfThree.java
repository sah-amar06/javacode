package JavaProgram;

public class LargestOfThree {

	public static void main(String[] args) {
		isLargest(-100, 50, 80);
		isGreatest(200, 300, 2000);
		

	}
	
	public static boolean isLargest(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("a is greater: " +a);
			return true;
		} else if(b>c){
			System.out.println("b is greater: " +b);
			return true;
		}else {
			System.out.println("c is greater: " +c);
			return true;
		}
	}
	
	public static boolean isGreatest(int x, int y, int z) {
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is the greatest number: " +x);
				return true;
			}
			else {
				System.out.println("z is greatest number: " +z);
				return true;
			}
		}else {
			if(y>z) {
				System.out.println("y is the greatest number: " +y);
				return true;
			}else {
				System.out.println("z is the greatest number: " +z);
				return true;
			}
		}
	}

}
