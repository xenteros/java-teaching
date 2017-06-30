package pesel;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by agurgul on 30.06.2017.
 */
public class Pesel {

    private Map<LocalDate, List<int[]>> pesels = new HashMap<>();

    public Pesel() {
    }

    public int[] newPesel(LocalDate date, boolean isMale) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
        int[] pesel = new int[11];
        String s = date.format(formatter);
        for (int i = 0; i < 6; i++) {
            pesel[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        int random = new SecureRandom().nextInt(1000);

        for (int i = 0; i < 3; i++) {
            pesel[i + 6] = random % 10;
            random /= 10;
        }
        pesel[10] = new SecureRandom().nextInt(5);

        return pesel;

    }
}
