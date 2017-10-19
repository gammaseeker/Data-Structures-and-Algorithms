package lab4;
import java.util.*;

public class LargestInArrayList {

	public static void main(String[] args) {
		
		int[] arr1 = {5, 74, 2, 94, 32};
		String[] arr2 = {"G", "A", "Y", "R", "C"};
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		for(int i : arr1) {
			list1.add(i);
		}
		System.out.println(largest(list1));
		System.out.println(largest(list2));
	}
	
	public static <E extends Comparable<E>> E largest(ArrayList<E> list) {
		E max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;
	}
}
