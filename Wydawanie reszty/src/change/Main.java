package change;

import change.service.ChangeService;
import change.util.Denomination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ChangeService changeService = new ChangeService();
        Map<Denomination, Integer> change = changeService.getChange(97);
        List<Map.Entry<Denomination, Integer>> list =
                new ArrayList<>(change.entrySet());
        list.sort(new Comparator<Map.Entry<Denomination, Integer>>() {
            @Override
            public int compare(Map.Entry<Denomination, Integer> o1, Map.Entry<Denomination, Integer> o2) {
                return Integer.compare(o2.getKey().getValue(), o1.getKey().getValue());
            }
        });
        for (Map.Entry<Denomination, Integer> denominationIntegerEntry : list) {
            System.out.println(denominationIntegerEntry.getValue() + " x " + denominationIntegerEntry.getKey().toString());
        }

    }
}
