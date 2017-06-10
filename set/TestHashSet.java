package set;
import java.util.*;

public class TestHashSet {
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");//Sets do not allow duplicates
		
		System.out.println(set);
		//Items are not in order of insertion
		for(String s: set)
		{
			System.out.println(s.toUpperCase() + " ");
		}
	}
}
