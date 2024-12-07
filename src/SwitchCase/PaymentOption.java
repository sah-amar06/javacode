package SwitchCase;

public class PaymentOption {

	public static void main(String[] args) {
		
		//upi, paypal, gpay, phonepe, RTGS, cards, netbanking, swift
		
		String pay = "phonepe";
		
		String result = "";
		
		result=switch(pay)
				{
					case "upi" -> "Only accepts payment through UPI";
					
					case "paypal" -> "Only accepts payment through paypal";
					
					case "gpay" -> "Only accepts payment through gpay";
					
					case "phonepe" -> "Accepts payment through phonepe";
					
					default -> "Please select the correct payment method";
					
				};
				
				System.out.println(result);

	}

}
