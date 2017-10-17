package basics;

public class TestCalc3
{
	
	public static void main(String args[])
	{
		// Here pass the value
		add(10,5);	
		add(20,8);
		add(40,7);
		
		
	}
	
	// 1. Define unique method for addition so pass value through parameter
	public static void add(int a, int b)
	{
			int sum = a + b;
			System.out.println("Additionn of two numbers are : "+sum);		
	}
	
	// 2. Define unique method fo subtraction
	public static void sub(int a, int b)
	{
		 	int sub = a - b;
		 	System.out.println("Subtraction of two numbers are : "+sub);		
	}
	
	// 3. Define unique method for multiplication
	public static void mul(int a, int b)
	{
			int mul = a * b;
			System.out.println("Multiplication of two numbers are : "+mul);
	}

	// 4. Define unique method for division
	public static void div(int a, int b)
	{
			int div = a / b;
			System.out.println("Divison of two numbers are : "+div);
		
	}
}