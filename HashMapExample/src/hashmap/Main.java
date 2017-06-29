package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Created by agurgul on 29.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> listOne = IntStream.range(1, 1000000).boxed().collect(toList());
        List<Integer> listTwo = IntStream.range(500001, 1500000).boxed().collect(toList());

        long start = System.currentTimeMillis();
        List<Integer> dupes = new ArrayList<>();
//        for (Integer first : listOne) {
//            if (listTwo.contains(first)) {
//                dupes.add(first);
//            }
//        }
        long end = System.currentTimeMillis();
        System.out.println("Calculation took " + (end - start) + " without HashSet");

        dupes = new ArrayList<>();
        start = System.currentTimeMillis();
        Set<Integer> set = new HashSet<>(listTwo);
        for (Integer first : listOne) {
            if (set.contains(first)) {
                dupes.add(first);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Calculation took " + (end - start) + " with HashSet");

    }
}
