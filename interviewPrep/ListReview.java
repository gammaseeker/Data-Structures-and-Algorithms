import java.util.*;

public class ListReview{

    public static void main(String[] args){
        arrayThings();        
    }

    public static void arrayThings(){
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 10));
    }

    public static void arrListThings(){
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++){
            myList.add((int)(Math.random() * 50) + 12);
        }
        insertSort(myList);
        System.out.println(myList);
    }

    private static void insertSort(List<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) > list.get(j)){

                }

            }
        }
    }

    public static void linkedListThings(){
        LinkedList<Integer> lin = new LinkedList<Integer>();

    }

    private static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(high >= low){
            int mid = low + (high-low)/2; 
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                high = mid - 1;
            }
            if(arr[mid] < key){
                low = mid + 1;
            }
        }
        return -1;
    }
}
