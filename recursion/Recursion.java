package recursion;


public class Recursion 
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
		System.out.println(powerN(2, 3));
		System.out.println(fib(11));
		System.out.println(countAs("Annaas"));
	}
	
	public static int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	
	public static int powerN(int base, int n) 
	{
	    if (n < 0) {
	        throw new IllegalArgumentException("Illegal Power Argument");
	    }
	    if (n == 0) 
	    {
	        return 1;
	    } 
	    else 
	    {
	        return base * powerN(base, n - 1);
	    }
	}
	
	public static int fib(int index)
	{
		if(index == 0)
		{
			return 0;
		}
		else
		{
			if(index == 1)
			{
				return 1;
			}
			else
			{
				return fib(index - 1) + fib(index - 2);
			}
		}
	}
	
	public static int countAs(String str)
	{
		if(str.length() == 0)
			return 0;
		if(str.length() == 1)
		{
			if(str.equals("a") || str.equals("A"))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return countAs(Character.toString(str.charAt(0))) + countAs(str.substring(1, str.length()));
		}
				
	}
}

