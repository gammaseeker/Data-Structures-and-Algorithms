package lab1;
import java.util.*;

public class Lab {

public static void printDistinct(int[] input) {
		
		int[] output = new int[10];
		int uniqueNums = 0;
		
		for (int i = 0; i < input.length; i++) {
			int a = input[i];
			
			boolean unique = true;
			
			for (int j = 0; j < uniqueNums; j++) {
				int b = output[j];
				
				if (a == b) {
					unique = false;
					break;
				}
			}
			
			if (unique) {
				output[uniqueNums] = a;
				uniqueNums++;
				System.out.println(a);
			}
		}
	}
	
	public static void searchTime() {
		Random r = new Random();
		int size = 100000000;
		
		int[] data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = r.nextInt();
		}
		int key = data[r.nextInt(size)];
		long startTime = System.currentTimeMillis();
		linearSearch(data, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		
		Arrays.sort(data);
		startTime = System.currentTimeMillis();
		binarySearch(data, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);
		
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid-1;
			}
			else if (key == list[mid]) {
				return mid;
			}
			else
				low = mid+1;
			
		}
		return -1 - low;
	}
	
	public static void TTT() {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[9];
		for (int i = 0; i < 9; i++) {
			data[i] = " ";
		}
		
		while (true) {
			displayTTT(data);
			System.out.println("X turn");
			System.out.println("Enter row: ");
			int row = Integer.parseInt(sc.nextLine());
			System.out.println("Enter col: ");
			int col = Integer.parseInt(sc.nextLine());
			data[ (row-1)*3 + col-1 ] = "X";
			
			if (checkWin(data)) {
				break;
			}
			
			displayTTT(data);
			System.out.println("Y turn");
			System.out.println("Enter row: ");
			row = Integer.parseInt(sc.nextLine());
			System.out.println("Enter col: ");
			col = Integer.parseInt(sc.nextLine());
			data[ (row-1)*3 + col-1 ] = "Y";

			if (checkWin(data)) {
				break;
			}
			
		}
		
	}
	
	public static boolean checkWin(String[] data) {
		//TODO
		return false;
	}
	
	public static void displayTTT(String[] data) {
		System.out.println(data[0] + " | " + data[1] + " | " + data[2]);
		System.out.println("_________");
		System.out.println(data[3] + " | " + data[4] + " | " + data[5]);
		System.out.println("_________");
		System.out.println(data[6] + " | " + data[7] + " | " + data[8]);
	}
	
	
	public static int collatz(int input) {
		if (input==1)
			return 0;
		else if (input%2==0)
			return 1+ collatz(input/2);
		else
			return 1+collatz(input*3+1);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Question 1: ");
		int[] question1input = {1,2,3,4,1,2,3,4,1,2};
		printDistinct( question1input );

		System.out.println("Question 2: ");
		searchTime();
		
		System.out.println("Question 3: ");
		TTT();
		
		System.out.println("Question 4: ");
		System.out.print( collatz(100) );
		
	}
}
