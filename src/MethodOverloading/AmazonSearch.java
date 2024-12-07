package MethodOverloading;

public class AmazonSearch {
	
	
	public void search()
	{
		System.out.println("Search the amazon product");
	}
	public void search(String name)
	{
		System.out.println("Search the amazon product with name :" +name);
	}
	public void search(String name, int price)
	{
		System.out.println("Search the amazon product with name and price :" +name +" " +price);
	}
	
	public void search(String name, int price, String col)
	{
		System.out.println("Search the amazon product with name, price and color :" +name+" " +price +" " +col);
	}

	public static void main(String[] args) {
		
		AmazonSearch obj = new AmazonSearch();
		obj.search();
		obj.search("Shirt");
		obj.search("Shirt", 699);
		obj.search("Shirt", 699, "blue");
		

	}

}
