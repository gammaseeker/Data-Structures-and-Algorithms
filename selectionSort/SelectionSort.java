package selectionSort;

public class SelectionSort {

	public static void main(String[] args)
	{
		System.out.print("selectionSort milliseconds: ");
		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int)(Math.random() * 101);
			
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		selectionSort(nums);
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			int lowPosition = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[lowPosition])
					lowPosition = j;	
			}
			swap(i, lowPosition, arr);
		}
	}
	
	private static void swap(int a, int b, int[] array)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
