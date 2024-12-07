package JavClass;

public class ClassIntro {
	
	//declaring the data members at class level(class variables/global variables)
	
	String ename;
	int age;
	char gender;
	double sal;
	boolean isParmanent;
	
	

	public static void main(String[] args) {
		
		ClassIntro emp = new ClassIntro();
		emp.ename="Ram";
		emp.age =28;
		emp.gender = 'M';
		emp.sal = 90000;
		emp.isParmanent = true;
		
		System.out.println(emp.ename+ " " +emp.age+ " " +emp.gender+ " " +emp.sal+ " " +emp.isParmanent);
		
		//No reference object : Not recommended (We have to create multiple objects to initialize the class data members)
		new ClassIntro().ename ="Rama";
		
		
		ClassIntro emp1 =new ClassIntro();
		emp1.ename = "Krishna";
		emp1.age = 30;
		//emp1 =null;
		emp1.isParmanent = true;	//java.lang.NullPointerException (here emp1 is pointing to null at line number 33)
		System.out.println(emp1.isParmanent);
		
		ClassIntro emp2 =new ClassIntro();
		emp2.ename = "Kavita";
		System.out.println(emp2.ename);
		emp2 = null;
		
		//After declaring it null, again re-assigning with a new object
		emp2 =new ClassIntro();
		emp2.ename ="Laxmi";
		System.out.println(emp2.ename);
		
		
	}

}
