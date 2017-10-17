package basics;


// This program is for how to track method calling i.e. call stack
public class StackTrace 
{
	public static void main(String args[])
	{
		
		int a=5, b=7, result, result2;
		StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
		for(int i=0; i<stackTraceElement.length;i++)
		{
			System.out.println(stackTraceElement[i].toString());
		}
		System.out.println("");
		result = max(a,b);
		//min(a,b);
		
		
	}
	
	public static int max(int x, int y)
	{
		int max;
		if(x>y)
		{
			max = x;
		}
		else
		{
			max = y;
		}
		
		min(x,y);
		System.out.println("");
		
		StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
		for(int i=0;i<stackTraceElement.length;i++)
		{
			System.out.println(stackTraceElement[i].toString());
			
		}
		System.out.println("");
		return max;
		
		
	}
	
	public static int min(int x, int y)
	{
		
		int min;
		if(x<y)
		{
			min = x;
		}
		else
		{
			min = y;
		}
		
		System.out.println("");
		
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for(int i=0;i<stackTrace.length;i++)
		{
			System.out.println(stackTrace[i].toString());
			
		}
		System.out.println("");
		return min;
	}
	
	public static void stackTracecall()
	{
		System.out.println("");
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		for(int i =0; i<stackTrace.length;i++)
		{
			System.out.println(stackTrace[i].toString());
		}
		System.out.println("");
	}

}
