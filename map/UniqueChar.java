package map;
import java.util.*;

public class UniqueChar {
	public static void main(String[] args)
	{
		String test1 = "Hello World";
		System.out.println(uniqueChar(test1));
	}
	
	public static String uniqueChar(String str)
	{
		String output = "";
		String[] arr = str.split("");
		Map<String, Boolean> strMap = new HashMap<>();
		
		for(String s: arr)
		{
			if(strMap.get(s) == null)
			{
				strMap.put(s, Boolean.TRUE);
				output += s;
			}
		}
		
		return output;
	}
}
