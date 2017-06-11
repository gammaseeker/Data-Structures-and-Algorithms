package cTcIArraysAndStrings;
import java.util.*;

public class QuestionOne {
	public static void main(String[] args)
	{
		String test = "Hello World";
		System.out.println(isUnique1(test));
		
		String test2 = "abcdefg";
		System.out.println(isUnique1(test2));
		
		System.out.println(isUnique2(test));
;
		System.out.println(isUnique2(test2));
	}
	
	public static boolean isUnique1(String str)//O(n^2)
	{
		String[] sArr = str.split("");
		for(int i = 0; i < sArr.length-1; i++)
		{
			for(int j = i + 1; j < sArr.length; j++)
			{
				if(sArr[i].equals(sArr[j]))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isUnique2(String str)//O(n)
	{
		String[] sArr = str.split("");
		Map<String, Integer> sMap = new HashMap<>();
		
		for(String s: sArr)
		{
			if(sMap.get(s) != null)
			{
				return false;
			}
			else
			{
				sMap.put(s, 1);
			}
		}
		
		return true;
	}
}
