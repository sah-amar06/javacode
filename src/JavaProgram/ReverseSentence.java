package JavaProgram;

public class ReverseSentence {

	public static void main(String[] args) {
		
		ReverseSentence reverse =  new ReverseSentence();
		reverse.isRevSentence(" Hello, how   are you ?");
		System.out.println();
		
		String name = " Today is   Sunday";  //OP: Sunday is Today
		name = name.trim();
		String rev[] = name.split("\\s+");   // \\s+ : used to remove more than one space in between the words
		
		for(int i=rev.length-1; i>=0; i--) {
			System.out.print(rev[i]+" ");
		}
		
		
		
		String s = "Hi My name";
		
		String split[] = s.split("\\s");
		String name2 = "";
		
		for(int i=split.length-1; i>0; i--) {
			for(int j=0; j<split.length; j++) {
				name2 = name2+ split[j];
			}
			System.out.println(name2);
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
