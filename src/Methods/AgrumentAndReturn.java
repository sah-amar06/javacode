package Methods;

public class AgrumentAndReturn {
	
	public double marks(int math, int science, int sst, int hindi, double negativemarks) {
		System.out.println("Your total marks is: ");
		double finalmarks = math+science+sst+hindi-negativemarks;
		return finalmarks;
				
	}

	public static void main(String[] args) {
		AgrumentAndReturn marks = new AgrumentAndReturn();
		double mark = marks.marks(80, 78, 91, 88, 10.33);
		System.out.println(mark);
		
	}

}
