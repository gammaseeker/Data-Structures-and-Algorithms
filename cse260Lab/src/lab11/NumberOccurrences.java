package lab11;
import java.util.*;

public class NumberOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter random integers.\nEnter 0 when finished: ");

        HashMap<Integer, Integer> occurrences = new HashMap<>();
        int number;
        while ((number = scanner.nextInt()) != 0) {
            if (!occurrences.containsKey(number))
                occurrences.put(number, 1);
            else
                occurrences.put(number, occurrences.get(number) + 1);
        }

        int max = Collections.max(occurrences.values());
        HashMap<Integer, Integer> highestOccurrences = new HashMap<>();
        occurrences.forEach((key, value) -> {
            if (value >= max)
                highestOccurrences.put(key, value);
        });

        System.out.println("Numbers with the max occurrences: ");
        highestOccurrences.forEach((key, value) ->
                System.out.println(key + " occurred " + value + " times"));
    }


}
