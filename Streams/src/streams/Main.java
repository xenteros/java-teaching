package streams;

/**
 * Created by agurgul on 05.07.2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Below there is an example coresponding to the notes
 * from flipchart
 */
public class Main {
    public static void main(String[] args) {
        List<String> rows = new ArrayList<>();
        rows.add("Litwo ojczyzno moja!");
        rows.add("Ty jesteś jak zdrowie,");
        rows.add("Ile Cię cenić trzeba ten tylko");
        rows.add("się dowie, kto Cię stracił");

        List<String> wordsLongerThan3 = rows.stream()
                .map(row -> row.split(" "))
                .flatMap(words -> Arrays.stream(words))
                .filter(word -> word.length() > 3)
                .collect(toList());
        System.out.println(Arrays.toString(wordsLongerThan3.toArray()));

        int letterCout = wordsLongerThan3.stream()
                .map(w -> w.length())
                .reduce((a, b) -> a + b).orElse(0);
        System.out.println(letterCout);

        String longestWord = wordsLongerThan3.stream()
                .reduce((a, b) -> (a.length() > b.length() ? a : b)
                ).orElse("");
        System.out.println(longestWord);

        letterCout = wordsLongerThan3.stream()
                .mapToInt(w -> w.length())
                .sum();
        double letterAvgLen = wordsLongerThan3.stream()
                .mapToDouble(w -> w.length())
                .average().orElse(0);

        System.out.println(letterAvgLen);
    }

}
