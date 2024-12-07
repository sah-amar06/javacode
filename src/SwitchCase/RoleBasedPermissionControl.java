package SwitchCase;

public class RoleBasedPermissionControl {

	public static void main(String[] args) {
		
		
		String user = "endUser";
		
		String result = "";
		
		result = switch(user)
				{
					case "admin" -> "They are authorized to track every records";
					
					case "vendoe" -> "Third party who are supply the orders ";
					
					case "logostic" -> "Moving the orders from vendors site to Warehouses";
					
					case "delivery" -> "Delivering the customer order to their location";
					
					case "endUser" -> "Placing an order";
					
					default -> "Invalid selection";
				};
				
				System.out.println(result);
	}

}
