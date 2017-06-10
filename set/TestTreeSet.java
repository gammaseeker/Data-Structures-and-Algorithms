package set;
import java.util.*;
public class TestTreeSet {
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("Sorted tree set: " + treeSet);//Sorted by compareTo
		
		System.out.println("\nfirst(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(\"New York\"): " +
				treeSet.headSet("New York"));//return items before New York, excluding New York
		System.out.println("tailSet(\"New York\"): " +
				treeSet.tailSet("New York"));//returns items after New York, including New York

		// Use the methods in NavigableSet interface
		System.out.println("lower(\"P\"): " + treeSet.lower("P"));//returns the largest element less than P
		System.out.println("higher(\"P\"): " + treeSet.higher("P"));//returns the smallest element greater than P
		System.out.println("floor(\"P\"): " + treeSet.floor("P"));//returns the largest element less than or equal to P
		System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));//returns the smallest element greater than or equal to P
		System.out.println("pollFirst(): " + treeSet.pollFirst());//removes the first element in treeSet and returns the removed element
		System.out.println("pollLast(): " + treeSet.pollLast());//removes the last element in treeSet and returns the removed element 
		System.out.println("New tree set: " + treeSet);
	}
}
