package JavaAdvanceCode;

public class ReverseSentence {

	public static void main(String[] args) {
		
		ReverseSentence obj = new ReverseSentence();
		String reverse = obj.revSentence("Welocome to India");
		System.out.println(reverse);

	}
	
	public String revSentence(String name) {
		
		String split[] = name.split("\\s+");
		String rev = "";
		
		for(int i= split.length-1; i>=0; i--) {
			rev = rev+split[i]+" ";
		}
		return rev;
	}

}
