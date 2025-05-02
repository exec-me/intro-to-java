package prac13;

import java.io.*;
import java.util.*;

public class task6 {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("C:\\Users\\mementomori\\Desktop\\ВУЗ\\3 sem\\Java uni\\intro-to-java\\prac13\\input.txt"));
        String[] words = fileScanner.nextLine().split(" ");
        fileScanner.close();

        StringBuilder chain = new StringBuilder();

        if (words.length > 0) {
            chain.append(words[0]);
            List<String> remaining = new ArrayList<>(Arrays.asList(words).subList(1, words.length));

            boolean found;
            do {
                found = false;
                for (int i = 0; i < remaining.size(); i++) {
                    String word = remaining.get(i);
                    if (chain.charAt(chain.length()-1) == word.toLowerCase().charAt(0)) {
                        chain.append(" ").append(word);
                        remaining.remove(i);
                        found = true;
                        break;
                    }
                }
            } while (found && !remaining.isEmpty());
        }

        System.out.println(chain);
    }
}