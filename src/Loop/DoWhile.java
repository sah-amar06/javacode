package Loop;

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("Post increment after and before...");
		int j =1;
		do {
			j++;
			System.out.println(j);
			j++;
		}while(j<=20);
		System.out.println("Post increment before...");
		
		j=1;
		do {
			j++;
			System.out.println(j);
			break;
			
		}while(j<=10);

	}
	
	

}
