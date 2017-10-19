package lab10;
import java.util.*;
import java.io.*;

public class NonduplicateWords {

	public static void main(String[] args) {
//		(NonduplicateWords.java) (Display nonduplicate words in ascending order) Write a program that reads words from a text file and displays all the nonduplicate words in ascending order (use a tree set). The text file is passed as a command-line argument.
		Scanner sc = new Scanner(System.in);
		Set <String> nonDup = new TreeSet<String>();
		while(sc.hasNext()) {
			nonDup.add(sc.nextLine());
		}
		System.out.println(nonDup);
	}
}
