package Constructor;

public class Registration {
	
	String name;
	String emailId;
	String phoneNum;
	int age;
	String place;
	
	

	public Registration(String name, String emailId) {
		this.name = name;
		this.emailId = emailId;
	}
	//9354017617: Anjali: less budget 
	
	public Registration(String name, String emailId, String phoneNum) {
		this.name = name;
		this.emailId = emailId;
		this.phoneNum = phoneNum;
	}

	public Registration(String name, String emailId, String phoneNum, int age) {
		this.name = name;
		this.emailId = emailId;
		this.phoneNum = phoneNum;
		this.age = age;
	}

	public Registration(String name, String emailId, String phoneNum, int age, String place) {
		this.name = name;
		this.emailId = emailId;
		this.phoneNum = phoneNum;
		this.age = age;
		this.place = place;
	}


	public static void main(String[] args) {
		Registration reg = new Registration("Shiva" , "shiva123@gmail.com");
		System.out.println(reg.name + " " +reg.emailId);
		

	}

}
