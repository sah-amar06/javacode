package Array;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		//[1,2,3,4,5,6]
		
		//[a,1,b,2,c,3]
		int Array[] = {1,2,3,4,5,6};
		int sum=0;
		int odd = 0;
		
//		for(int a:Array) {
//			if(a%2==0) {
//				sum=sum+a;
//			}
//			else {
//				odd = odd+a;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(odd);

		
		for(int i=0; i<Array.length; i++) {
			if(Array[i]%2==0) {
				sum = sum+Array[i];
			}
		}
		System.out.println(sum);
		
 	}

}
