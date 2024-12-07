package String;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String a = "Jai";
		String b = "Shree";
		String c = "Ram";
		
		int x = 10; 
		int y = 20;
		
		//Sting concatenation
		System.out.println(a+b+c); //JaiShreeRam
		System.out.println("Jai" + "Shree" + "Ram");  //JaiShreeRam
		
		System.out.println(a+b+c+x+y);		//JaiShreeRam1020
		System.out.println(x+y+a+b+c);		//30JaiShreeRam
		System.out.println(x+a+b+c+y);		//10JaiShreeRam20
		System.out.println(a+b+c+(x+y));	//JaiShreeRam30

		
		char ch = 'a';
		char cr = 'b';
		System.out.println(ch+cr); 		//195 : ASCII value of both the character
		System.out.println(ch+""+cr); 	//ab
		
		System.out.println(ch+" "+cr); 	//a b
		
		System.out.println(ch+cr+a+b+c); 	//195JaiShreeRam
		
		System.out.println(ch+' '+cr); 		//227
	}

}
