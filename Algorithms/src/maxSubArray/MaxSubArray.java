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
}
