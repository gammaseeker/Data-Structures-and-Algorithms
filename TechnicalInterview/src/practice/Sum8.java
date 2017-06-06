package practice;
import java.util.*;

public class Sum8 {

	public static void main(String[] args)
	{
		int sum = 8;
		//Assume array is sorted
		int[] test1 = {1, 2, 5, 9};
		int[] test2 = {1, 2, 4, 4};
		System.out.println(getSumInefficient(test1, sum));
		System.out.println(getSumInefficient(test2, sum));
	}
	
	private static boolean getSumInefficient(int[] arr, int sum)//O(n^2)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean getSum(int[] arr, int sum)
	{
		if(arr[arr.length-1] <= sum/2)
		{
			if(arr[arr.length-2] == sum/2)
			{
				return true;
			}
		}
		else
		{
			for(int i = 0; i < arr.length; i++)//Do a binary search maybe?
			{
				if(arr[i] <= sum/2 && arr[i+1] > sum/2)
				{
					int[] split1 = Arrays.copyOfRange(arr, 0, i);
					int[] split2 = Arrays.copyOfRange(arr, i+1, arr.length-1);
					
				}
			}
		}
		
		return false;
	}
}
