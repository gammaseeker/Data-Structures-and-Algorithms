package Practice;

public class DistinctElements {
	public static void main(String[] args)
	{
		int[] test1 = {1, 5, 15, 20};
		int[] test2 = {2, 5, 13, 30};
		System.out.println(bruteForce(test1, test2));
		System.out.println(optimized(test1, test2));
		int[] test3 = {1, 5, 15, 20, 37};
		int[] test4 = {2, 5, 13, 30, 32, 35, 37, 42};
		System.out.println(bruteForce(test3, test4));
		System.out.println(optimized(test3, test4));
	}
	
	private static int bruteForce(int[] a, int[] b)// O(ab)
	{
		int ctr = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
					ctr++;
			}
		}
		return ctr;
	}
	
	private static int optimized(int[] a, int[] b)//O(a+b)
	{
		int ctr = 0;
		int i = 0;
		int j = 0;
		while(i < a.length && j < b.length)
		{
			if(a[i] == b[j])
			{	
				ctr++;
				i++;
				j++;
			}
			else
			{
				if(a[i] > b[j])
				{
					j++;
				}
				else
				{
					i++;
				}
			}
		}
		return ctr;
	}
}
