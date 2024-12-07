package JavaProgram;

public class ReverseSentence {

	public static void main(String[] args) {
		
		ReverseSentence reverse =  new ReverseSentence();
		reverse.isRevSentence(" Hello, how   are you ?");
		System.out.println();
		
		String name = "Today is   Sunday";  //OP: Sunday is Today
		
		String rev[] = name.split("\\s+");   // \\s+ : used to remove more than one space in between
		
		for(int i=rev.length-1; i>=0; i--) {
			System.out.print(rev[i]+" ");
		}

	}

	public String isRevSentence(String s) {
		s = s.trim();
		String split[] = s.split("\\s+");
		String rev = "";
		
		for(int i=split.length-1; i>=0; i--) {
			rev = split[i]+" ";
			System.out.print(rev);
		}
		return rev;
	}
}
