package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Created by agurgul on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList(args);

        stringList.forEach(s -> {
            System.out.println(s);
            System.out.println(s+s);
        });

        List<Integer> list = IntStream.range(1,4).boxed().collect(toList());
        System.out.println(permutations(list));
    }

    private static Set<List<Integer>> permutations(List<Integer> list) {
        if (list.size() == 0) {
            Set<List<Integer>> result = new HashSet<>();
            result.add(new ArrayList<>());
            return result;
        }
        int last = list.remove(list.size()-1);
        return permutations(list).stream()
                .map(l -> inject(l, last))
                .flatMap(Set::stream)
                .collect(toSet());

        /*Could be replaced with*/
//        Set<List<Integer>> result = new HashSet<>();
//        for (List<Integer> integerList : permutations(list)) {
//            Set<List<Integer>> temp = inject(integerList, last);
//            result.addAll(temp);
//        }
//        return result;
    }

    private static Set<List<Integer>> inject(List<Integer> list, int n) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i <= list.size(); i++) {
            List<Integer> temp = new ArrayList<>(list);
            temp.add(i, n);
            result.add(temp);
        }
        return result;
    }



    public static long factorial(int n) {
        System.out.println("Factorial called with n = " + n);
        if (n == 1) {
            return 1l;
        }
        long partialResult = factorial(n - 1);
        System.out.println("Partial " + partialResult);
        return partialResult * n;
    }

    public static long intpower(int n, int m) {
        if (n == 0 && m == 0) {
            throw new IllegalArgumentException("0^0 is undefined symbol");
        }
        if (m == 0) {
            return 1;
        }
        if (m % 2 == 0) {
            long temp = intpower(n, m/2);
            return temp*temp;
        } else {
            long temp = intpower(n, (m-1)/2);
            return temp*temp*n;
        }
    }
}
