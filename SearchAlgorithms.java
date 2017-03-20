
public class SearchAlgorithms 
{
	public static void main(String[] args)
	{
		int[] myArr = {1, 2, 3, 4, 6, 7, 9, 11, 12, 14, 15, 16, 17, 19, 33, 34, 43, 45, 55, 66 };
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++)
		{
			int data = randomWithRange(1, 999);
			arr[i] = data;
		}
		long start = 0;
		long end = 0;
		start = System.nanoTime();
		insertionSort(arr);
		end = System.nanoTime();
		System.out.println(end-start + " nanoseconds");
		
		int target = arr[randomWithRange(0, 100)];
		
		/*long start2 = 0;
		long end2 = 0;
		start = System.nanoTime();
		binarySearch(myArr, 3);
		end = System.nanoTime();
		System.out.println(end2-start2);*/
		System.out.println(target);
		long start3 = 0;
		long end3 = 0;
		start3 = System.nanoTime();
		binarySearch(arr, target);
		end3 = System.nanoTime();
		System.out.println(end3-start3 + " nanoseconds");
		printArr(arr);
	}
	
	public static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int randomWithRange(int min, int max)
	{
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
	}
	
	public static void insertionSort(int[] elements)
	{
		for(int j = 1; j < elements.length; j++)
		{
			int temp = elements[j];
			int possibleIndex = j;
			while(possibleIndex > 0 && temp < elements[possibleIndex-1])
			{
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
	}
	
	public static int binarySearch(int[] arr, int data)
	{
		int lower = 0;
		int upper = arr.length;
		boolean found = false;
		while(!found)
		{
			if(upper < lower)
			{
				return -1;
			}
			int mid = lower + (upper - lower)/2;
			
			if(arr[mid] < data)
			{
				lower = mid + 1;
			}
			if(arr[mid] > data)
			{
				upper = mid - 1;
			}
			if(arr[mid] == data)
			{
				found = true;
				return mid;
			}
		}
		return -1;
	}
}
