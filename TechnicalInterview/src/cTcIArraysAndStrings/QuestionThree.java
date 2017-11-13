package cTcIArraysAndStrings;

import java.util.Arrays;

public class QuestionThree {

	public static void main(String[] args)
	{
		String test = "Mr John Smith  ";
		System.out.println(URLify(test, 13));
		System.out.println(URLifyChar(test, 13));
	}
	
	public static String URLify(String s, int length)//O(n)
	{
		String output = "";
		String[] sArr = s.split("");
		String[] strArr = Arrays.copyOfRange(sArr, 0, length);
		for(String str: strArr)//O(n)
		{
			if(str.equals(" "))
			{
				output += "%20";
			}
			else
			{
				output += str;
			}
		}
		return output;
	}
	
	public static String URLifyChar(String s, int length)//O(n)
	{
		String output = "";
		String helper = "";
		String[] sArr = s.split("");
		String[] strArr = Arrays.copyOfRange(sArr, 0, length);
		for(String str : strArr)
		{
			helper += str;
		}
		char[] c = helper.toCharArray();
		for(char ch: c)//O(n)
		{
			if(ch == ' ')
			{
				output += "%20";
			}
			else
			{
				output += ch;
			}
		}
		return output;
	}
}
