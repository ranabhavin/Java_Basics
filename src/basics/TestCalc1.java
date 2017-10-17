package basics;

public class TestCalc1
{
	
	public static void main(String args[])
	{
		
		// 2. Call the method
		calculate();
		
	}
	// 1. Define the Method.
	public static void calculate()
	{
		int a =20, b=5;
		
		int sum = a + b;
		System.out.println("Addition of two numbes are : "+sum);
		
		int sub =  a - b;
		System.out.println("Subtraction of two numbers are : "+sub);
		
		int mul = a*b;
		System.out.println("Multiplication of two numbers are : "+mul);
		
		int div= a/b;
		System.out.println("Divission of two numbers are : "+div);
				
	}
	

}