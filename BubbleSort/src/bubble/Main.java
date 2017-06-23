package bubble;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by agurgul on 22.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        int[] ints = IntStream.range(0,100).toArray();
        List<Integer> list = IntStream.range(0,100).boxed()
                .collect(Collectors.toList());
        Collections.shuffle(list);
        ints = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
