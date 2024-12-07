package Methods;

public class NoArgumentReturnValue {
	
	public int getBill() {
		System.out.println("Get bill amount");
		int foodBill  =100;
		int tax = 20;
		int finalBill = foodBill+tax;
		return finalBill;
	}
	

	public static void main(String[] args) {
		
		NoArgumentReturnValue bill = new NoArgumentReturnValue();
		int amount =bill.getBill();
		System.out.println(amount);		

		//We can directly print the bill amount at line number 16, but it is not a good programming practice.
		//We there is some need to perform other action then in that case first store them into a variable then perform the actions.
		
		amount = (bill.getBill()-10);
		System.out.println(amount);
	}

}
