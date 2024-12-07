package Array;

import java.util.Arrays;

public class Intro {

	public static void main(String[] args) {
		
		
		String name[] = new String[5];
		name[0] = "Ram";
		name[1] = "Shyam";
		name[2] = "Ganesh";
		name[3] = "Sita";
		name[4] = "Shubham";
		//name[5] = "Hari";	//java.lang.ArrayIndexOutOfBoundsException
		
		for(String names:name)
		{
			System.out.println(names);
			if(names.equals("Sita"))
			{
				System.out.println("Jai Shree Ram");
			}
			else if(names.equals("Ram"))
			{
				System.out.println("Hare Ram");
			}
		}
		
		//Arrays.toString() is applicable for all the datatypes.
		
		String emp[] = new String[5];
		emp[0] = "Kavita";
		emp[1] = "Ekta";
		emp[2] = "Vishnu";
		emp[3] = "Hari";
		emp[4] = "Varsha";
		System.out.println(Arrays.toString(emp));
		
		for(String emps:emp)
		{
			System.out.println(emps);
			
			if(emps.equals("Kavita"))
			{
				System.out.println("HR");
			}else if(emps.equals("Ekta"))
			{
				System.out.println("People Partner");
			}else if(emps.equals("Vishnu"))
			{
				System.out.println("Engineer");
			}else if(emps.equals("Hari"))
			{
				System.out.println("Senior Engineer");
			}else {
				System.out.println("GE");
			}
		}
		
		System.out.println("Arrays.toString() method to get the array value without any loop");
		
			int num[] = new int[4];
				num[0]= 100;
				num[1]= 120;
				num[2]= 130;
				num[3]= 140;
				System.out.println(Arrays.toString(num));
				
				System.out.println("increasing/decreasing the array size of an existing array:");
				//After increasing/decreasing the array size we are not declaring any values for increased/decreased size
				num = new int[3];
				System.out.println(Arrays.toString(num));	//[0, 0, 0]
				
				
		

	}

}
