package StaticAndnonStatic;

public class StaticAndNonStaticVariables {
	
	String name;
	int age;
	static String country = "Indian";
	
	void citizenShip()
	{
		System.out.println("inside non static method");
		System.out.println(country);
		System.out.println(name = "Shyam");
		System.out.println(name = "Ram");
		System.out.println("inside non static method");
	}
	
	static void age() {
		System.out.println("Inside Static method");
	}

	public static void main(String[] args) {
		
		StaticAndNonStaticVariables ct = new StaticAndNonStaticVariables();
		ct.citizenShip();
		ct.name= "Laxmi";
		System.out.println(ct.name);
		StaticAndNonStaticVariables.age();

	}

}
