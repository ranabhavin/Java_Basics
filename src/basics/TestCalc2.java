package basics;

public class TestCalc2
{
	
		public static void main(String args[])
		{
			add();			
		}
		// 1. Create seperate method for addition.
		public static void add()
		{			
			int a=10,b=5;			
			int sum= a + b;
			System.out.println("Addition of two numbers are : "+sum);
		}
		
		// 2. Create seperate method for subtraction
		public static void sub()
		{			
			int a=10, b=5;
			int sub = a -b ;
			System.out.println("Subtraction of two numbers are : "+sub);
		}
		
		// 3. Create seperate method for multiplication
		public static void mul()
		{
			
			int a= 10, b=5;
			int mul = a * b;
			System.out.println("Multiplication of two numbers are : "+mul);
		}
		
		// 4. Create seperate method for division
		public static void div()
		{
			int a=10, b=5;
			int div = a/b;
			System.out.println("Division of two numbers are : "+div);
			
		}

}