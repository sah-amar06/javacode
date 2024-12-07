package JavClass;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		
		User u1 = new User();
		u1.name ="Arti";
		u1.age = 25;
		u1.city = "Bengalore";
		
		User u2 = new User();
		u2.name = "Shiva";
		u2.age = 30;
		u2.city = "Patna";
		
		User u3 = new User();
		u3.name = "Shyam";
		u3.age = 32;
		u3.city = "Hyderabad";
		
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city );		
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city );
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city );
		
		System.out.println("Update the values of u1 with u2");
		
		u1=u2;	//All the values of u1 will now updated to u2
		
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city );		
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city );
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city );
		
		System.out.println("Update the values of u2 with u3");

		u2=u3;	//All the values of u2 will now updated to u3
		
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city );		
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city );
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city );
		
		System.out.println("Update the values of u3 with u1");
		u3=u1;
		
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city );		
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city );
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city );
		
		
	}

}
