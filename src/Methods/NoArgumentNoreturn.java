package Methods;

public class NoArgumentNoreturn {
	
	
	public void add() {
		int a = 10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		NoArgumentNoreturn method = new NoArgumentNoreturn();
		method.add();

	}

}
