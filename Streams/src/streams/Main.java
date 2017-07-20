package streams;

/**
 * Created by agurgul on 05.07.2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                .flatMap(words -> Arrays.stream(words)) //could be replaced with Arrays::stream - method reference - included below
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
                .mapToDouble(String::length)    //method reference - stands for s -> s.length()
                .average().orElse(0);

        System.out.println(letterAvgLen);

        List<Date> dates = new ArrayList<>();

        dates.sort((o1, o2) -> {
            Date now = new Date();
            Long nowStamp = now.getTime();
            return Long.compare(Math.abs(o1.getTime() - nowStamp), Math.abs(o2.getTime() - nowStamp));
        });
        Comparator<List<Integer>> listComparator = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for (int i = 0; i < o1.size() && i < o2.size(); i++) {
                    if (!o1.get(i).equals(o2.get(i))){
                        return o1.get(i).compareTo(o2.get(i));
                    }
                }
                return Integer.valueOf(o1.size()).compareTo(o2.size());
            }
        };

        Map<String, List<Integer>> map = new HashMap<>();
        List<String> sorted = map.entrySet().stream()
            .sorted((o1, o2) -> listComparator.compare(o1.getValue(), o2.getValue()))
            .map(Map.Entry::getKey)
            .collect(toList());

        System.out.println("Git flow example");

    }






}
