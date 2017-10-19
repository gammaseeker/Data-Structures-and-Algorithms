package lab11;
import java.util.*;

public class CountOccurrenceOfWords {

    public static void main(String[] args) {

        String text = "Test test hello Test";
        
        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[\\s+]");
        for (String w : words) {
            String key = w.toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        ArrayList<WordOccurrence> list = new ArrayList<>();
        map.forEach((k, v) -> list.add(new WordOccurrence(k, v)));
        Collections.sort(list);
        list.forEach((word) -> System.out.println(word.word + "\t" + word.count));


    }

    private static class WordOccurrence implements Comparable<WordOccurrence> {

        int count;
        String word;

        public WordOccurrence(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(WordOccurrence o) {
            if (o.count > count)
                return -1;
            else if (o.count < count)
                return 1;
            else
                return 0;
        }
    }
}
