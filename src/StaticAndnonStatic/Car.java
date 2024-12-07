package StaticAndnonStatic;

public class Car {
	
	//Declaring global/class variable
	
	String name;			//non-static data members are called with the class instance and can be created 'n' numbers of copies
	Long price;
	String color;
	static final int wheels = 4;		//the number of wheels are same for all the cars. hence declaring it as a static data member
								//static data member is available for all the available methods
	

	public static void main(String[] args) {
		
		//static int lic = 725;	//static variable can be declared only at class/global level, not as a local variable
		
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 892376l;
		c1.color = "red";
		System.out.println(Car.wheels);
		
		Car c2 = new Car();
		c2.name ="Audi";
		c2.price = 82363l;
		c2.color = "Black";
		System.out.println(Car.wheels);
		
		//Access the static variable
		//1. By using class name
		System.out.println(Car.wheels);
		
		//2. direct calling
		System.out.println(wheels);

	}

}
