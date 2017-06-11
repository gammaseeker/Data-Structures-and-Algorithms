package cTcIArraysAndStrings;
import java.util.*;

public class QuestionTwo {
	public static void main(String[] args)
	{
		String test = "abc";
		String test2 = "cba";
		System.out.println(isPermutation1(test, test2));
		
		String test3 = "abc";
		String test4 = "123";
		System.out.println(isPermutation1(test3, test4));
		
		String test5 = "abab";
		String test6 = "ba";
		System.out.println(isPermutation1(test5, test6));
		
		System.out.println(isPermutation2(test, test2));
		System.out.println(isPermutation2(test3, test4));
		System.out.println(isPermutation2(test5, test6));
	}
	
	public static boolean isPermutation1(String s1, String s2)//O(n^2)
	{
		ArrayList<String> sArr1 = new ArrayList<String> (Arrays.asList(s1.split("")));
		ArrayList<String> sArr2 = new ArrayList<String> (Arrays.asList(s2.split("")));
		
		for(String s: sArr1)//O(n)
		{
			if(!sArr2.contains(s))//O(n)
			{
				return false;
			}
			else
			{
				sArr2.remove(s);
			}
		}
		return true;
	}
	
	public static boolean isPermutation2(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		int[] letters = new int[128];
		
		char[] sArr = s1.toCharArray();
		for(char c: sArr)//O(n)
		{
			letters[c]++;
		}
		
		for(int i = 0; i < s2.length(); i++)//O(n)
		{
			int c = (int) s2.charAt(i);
			letters[c]--;
			if(letters[c] < 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
