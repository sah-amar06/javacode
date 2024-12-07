package SwitchCase;

public class SwitchCaseWithReturn {

	public static void main(String[] args) {
		
		String day ="Sunday";
		String result ="";
		
		result = switch(day)
		{
		case "Saturday", "Sunday" -> "Set an alarm at 8 AM";
		
		case "Monday" -> "Set an alarm at 6 AM";
		
		default -> "Set an alarm at 7 AM";
		};
		
		System.out.println(result);
	}

}
