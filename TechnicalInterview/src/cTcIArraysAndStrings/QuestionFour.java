package cTcIArraysAndStrings;

import java.util.*;

public class QuestionFour {

	public static void main(String[] args)
	{
		//Input: Tact Coa
		//Output: True (taco cat, atco cta)
	}
	
	public static boolean isPalindromePermutation(String s1)
	{
		char[] cArr = s1.toCharArray();
		ArrayList<Character> sArr =  new ArrayList<Character>();
		int[] letters = new int[128];

		for(int i = sArr.size()-1; i >= 0; i--)
		{
			if(sArr.get(i).equals(" "))
			{
				sArr.remove(i);
			}
		}
		return true;
	}
}
