package set;
import java.util.*;

public class UniqueChar {
	public static void main(String[] args)
	{
		String test = "Hello World";
		System.out.println(uniqueChar(test));
	}
	
	public static String uniqueChar(String str)
	{
		String output = "";
		String[] arr = str.split("");
		Set<String> set = new LinkedHashSet<>();
		for(String s: arr)
		{
			set.add(s);
		}
		for(String unique: set)
		{
			output += unique;
		}
		return output;
	}
}
