package patterns;

import patterns.model.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by agurgul on 05.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        User trump = new User(1l, "Donald", "Trump", null, new Date(), null, new ArrayList<>(), null);
        System.out.println(trump.toString());

        User obama = new User.Builder()
                .withId(2L)
                .withFirstName("Barack")
                .withLastName("Obama")
                .withCreatedAt(new Date())
                .withModerationRoles(new ArrayList<>())
                .build();
        System.out.println(obama.toString());
    }
}
