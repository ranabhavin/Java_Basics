package basics;

public class TestCalc4
{
	public static void main(String args[])
	{
		
		int x = add(5,6);
		//System.out.println("Addition of two numbers are : "+x);
	}
	
	// Define smart method 
		public static int add(int a, int b)
		{
			int sum = a + b;
			System.out.println("Addition of two numbers are : "+sum);
			return sum;		
		}
		public static int sub(int a, int b)
		{
			int sub = a - b;
			return sub;		
		}
		public static int mul(int a, int b)
		{
			int mul = a * b;
			return mul;	
		}

		public static int div(int a, int b)
		{
			int div= a / b;
			return div;
		}


}
