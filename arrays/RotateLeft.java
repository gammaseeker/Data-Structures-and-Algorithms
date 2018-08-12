package arrays;

public class RotateLeft {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int r = 2;
		arr = rotateArray(arr, r);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public static int[] rotateArray(int[] arr, int r) {
		int[] temp = new int[arr.length];
		int ctr = 0;
		for(int i = r%arr.length; i < arr.length; i++) {
			temp[ctr] = arr[i];
			ctr++;
		}
		for(int i = 0; i < r%arr.length; i++) {
			temp[ctr] = arr[i];
			ctr++;
		}
		return temp;
	}
	
}
