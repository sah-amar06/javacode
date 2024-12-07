package DataTypes;

public class MathematicalOperation {

	public static void main(String[] args) {
		
		System.out.println(10/2);	//5
		
		System.out.println(9/2); 	//4 
									// both data types are of "int" type and if we are performing
									//any mathematical operation then the output will be always "int"

		System.out.println(9.0/2); //4.5
		//If we are dividing any "int" data type with zero the we will get "ArithmeticException"
		//System.out.println(5/0);	//java.lang.ArithmeticException: / by zero
		
		System.out.println(5.0/0); 	//Infinity
		
		System.out.println(7/0.0); 	//Infinity
		
		//System.out.println(0/0); 	//java.lang.ArithmeticException: / by zero
		
		System.out.println(0.0/0.0); 	//NaN: Not a Number
		
		System.out.println(0/0.0);		//NaN: Not a Number
		
		System.out.println(0.1+0.4);	//0.5
		
		System.out.println(0.1+0.2); 	//0.30000000000000004: This is coming due to precision error 
										//When converting them to machine understandable language (Binary numbers)
	}

}
