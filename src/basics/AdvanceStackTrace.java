package basics;

public class AdvanceStackTrace {
	
	public static void main(String args[])
	{
		int a=5, b=7, result;
		stackTraceCallStatusCheck();
		result = max(a,b);
		
	}
	public static int max(int x, int y)
	{
		int max;
		if(x>y)
		{
			max=x;
		}
		else
		{
			max = y;
		}
		stackTraceCallStatusCheck();
		return max;
		
	}
	
	// Only 1 time create method
	public static void stackTraceCallStatusCheck()
	{
		System.out.println("");
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for(int i=0; i<stackTrace.length;i++)
		{
			System.out.println(stackTrace[i].toString());
		}
		System.out.println("");
	}

}
