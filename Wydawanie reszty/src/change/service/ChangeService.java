package change.service;

import change.util.Denomination;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by agurgul on 21.06.2017.
 */
public class ChangeService {


    public Map<Denomination, Integer> getChange(int change) {
        Map<Denomination, Integer> result = new HashMap<>();
        Denomination[] denominations = Denomination.values();
        for (int i = denominations.length - 1; i >= 0; i--) {
            int count = 0;
            while (change >= denominations[i].getValue()) {
                count++;
                change -= denominations[i].getValue();
            }
            if (count > 0) {
                result.put(denominations[i], count);
            }
        }
        return result;

    }
}
