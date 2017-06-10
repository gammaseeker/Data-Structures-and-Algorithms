package set;
import java.util.*;

public class TestLinkedHashSet {
	public static void main(String[] args)
	{
		Set<String> set = new LinkedHashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		for(String element: set)
		{
			System.out.print(element.toLowerCase() + " ");
		}
	}
}
