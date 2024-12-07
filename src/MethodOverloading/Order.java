package MethodOverloading;

public class Order {
	
	public void searchOrder()
	{
		System.out.println("Your order is : ");
	}
	
	public void searchOrder(int ordernum)
	{
		System.out.println("Please enter the order number : " +ordernum );
	}
	
	public void searchOrder(int ordernum, String date)
	{
		System.out.println("Please enter the order number and date : " +ordernum +" " + date );
	}
	
	public void searchOrder(String loc)
	{
		System.out.println("Please enter your prefered location : " +loc );
	}

	public static void main(String[] args) {
		
		Order ordr = new Order();
		ordr.searchOrder();
		ordr.searchOrder(762534);
		ordr.searchOrder("bhuj");
		ordr.searchOrder(723563, "12/06/2023");
		
		

	}

}
