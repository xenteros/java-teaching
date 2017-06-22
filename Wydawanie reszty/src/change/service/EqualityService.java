package change.service;

/**
 * Created by agurgul on 21.06.2017.
 */
public class EqualityService {

    public static int getN() {
        int n = 1;
        double sum = 0;

        while (sum < 10) {
            sum += 1.0/n++;
        }
        return n;
    }
}
