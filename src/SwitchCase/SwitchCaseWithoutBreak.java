package SwitchCase;

public class SwitchCaseWithoutBreak {

	public static void main(String[] args) {
		
		
		String day ="Monday";
		
		
		//Convert to the lower case is applicable only with String
		//trim() : it trims the space from the corner of the String
		switch(day.trim().toLowerCase())
		{
		case "saturday", "sunday" -> System.out.println("Set an alarm at 8 AM");
		
		case "monday" -> System.out.println("Set an alarm at 6 AM");
		
		default -> System.out.println("Set an alarm at 7 AM");
		}

	}

}
