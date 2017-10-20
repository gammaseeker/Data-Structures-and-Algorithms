package maxSubArray;
import java.util.*;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] sample = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		System.out.println(FindMaxCrossingSubarray(sample, 0, 7, 15));
	}
	
	public static ArrayList<Integer> FindMaxCrossingSubarray(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int rightSum = Integer.MIN_VALUE;
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		int maxLeft = 0;
		int maxRight = 0;
		
		for(int i = mid; i >= low; i--) {
			sum = sum + arr[i];
			if(sum > leftSum) {
				leftSum = sum;
				maxLeft = i;
			}
		}
		
		sum = 0;
		for(int j = mid + 1; j <= high; j++) {
			sum = sum + arr[j];
			if(sum > rightSum) {
				rightSum = sum;
				maxRight = j;
			}
		}
		output.add(maxLeft);
		output.add(maxRight);
		output.add(leftSum + rightSum);
		return output;
		
	}
	
	public static int maxCrossingSum(int arr[], int l, int m, int h)
	{
		// Include elements on left of mid.
		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--)
		{
			sum = sum + arr[i];
			if (sum > left_sum)
				left_sum = sum;
		}
		
		// Include elements on right of mid
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = m + 1; i <= h; i++)
		{
			sum = sum + arr[i];
			if (sum > right_sum)
				right_sum = sum;
		}
		
		// Return sum of elements on left
		// and right of mid
		return left_sum + right_sum;
	}
	
	public static int maxSubArraySum(int arr[], int l, int h)
	{
		// Base Case: Only one element
		if (l == h)
		return arr[l];
		
		// Find middle point
		int m = (l + h)/2;
		
		/* Return maximum of following three 
		possible cases:
		a) Maximum subarray sum in left half
		b) Maximum subarray sum in right half
		c) Maximum subarray sum such that the 
		subarray crosses the midpoint */
		return Math.max(Math.max(maxSubArraySum(arr, l, m),
		maxSubArraySum(arr, m+1, h)),
		maxCrossingSum(arr, l, m, h));
	}
}
