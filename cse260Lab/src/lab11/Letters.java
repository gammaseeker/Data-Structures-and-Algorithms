package lab11;
import java.util.*;
import java.io.*;

public class Letters {
    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Enter file name: ");
        File file = new File(new Scanner(System.in).next());
        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file");

        int vowelCount = 0;
        int consonantCount = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            
            char[] chArr = {'A', 'E', 'I', 'O', 'U'};
            Map<Character, Integer> vowels = new HashMap<Character, Integer>();
            for(char ch : chArr){
                vowels.put(ch, 0);
            }
            String s;
            while ((s = in.readLine()) != null) {
                for (char c : s.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        c = Character.toUpperCase(c);
                        if (vowels.containsKey(c))
                            vowelCount++;
                        else
                            consonantCount++;
                    }
                }
            }

        } catch (IOException ex) {}

        System.out.println("Total vowels = " + vowelCount);
        System.out.println("Total consonants = " + consonantCount);
    }
        
    
}
