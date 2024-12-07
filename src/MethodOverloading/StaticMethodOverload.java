package MethodOverloading;

public class StaticMethodOverload {
	
	public static void add()
	{
		System.out.println("Add two numbers:");
	}
	
	public static void add(int a)
	{
		System.out.println("Add two numbers:" +a);
	}
	public static void add(int a, int b)
	{
		System.out.println("Add two numbers:" +a +" "+b);
	}

	public static void main(String[] args) {
		
		StaticMethodOverload.add();
		StaticMethodOverload.add(10);
		StaticMethodOverload.add(10, 20);
	}

}
