package JavaProgram;

public class LeapYear {

	public static void main(String[] args) {

		int year = 1404;
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
				}else {
					leap = true;
					}
				}else {
					leap = false;
				}
				if (leap) {
					System.out.println("Given year is a leap year: " + year);
				} else {
					System.out.println("Given year is not a leap year: " + year);
				}
				
				
		}
	}

