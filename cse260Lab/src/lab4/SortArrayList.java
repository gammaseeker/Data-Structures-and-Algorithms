package lab4;
import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
		
		int[] arr1 = {5, 74, 2, 94, 32};
		String[] arr2 = {"G", "A", "Y", "R", "C"};
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		for(int i : arr1) {
			list1.add(i);
		}
		sort(list1);
		sort(list2);
		System.out.println(list1);
		System.out.println(list2);
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> arr) {
		int n = arr.size();
		 
        
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if ((arr.get(j)).compareTo(arr.get(min_idx)) < 0)
                    min_idx = j;
 
            
            E temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
	}
}
