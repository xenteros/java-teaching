package pesel;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by agurgul on 30.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        Pesel pesel = new Pesel();
        System.out.println(Arrays.toString(pesel.newPesel(LocalDate.now(), true)));
    }
}
