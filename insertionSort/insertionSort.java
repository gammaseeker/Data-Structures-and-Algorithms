package insertionSort;

public class insertionSort {
	public static void main(String[] args)
	{
		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int)(Math.random() * 101);
		
		long start = 0;
		long end = 0;
		
		System.out.print("insertionSort milliseconds: ");
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int)(Math.random() * 101);
			
		start = System.currentTimeMillis();
		insertionSort(nums);
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void insertionSort(int[] elements)
	{
		for (int j = 1; j < elements.length; j++)
		{
			int temp = elements[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
			{
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
	}
	
}
