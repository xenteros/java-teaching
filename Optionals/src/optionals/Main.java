package optionals;

import optionals.model.User;
import optionals.service.UserService;

/**
 * Created by agurgul on 23.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = userService.findUser(4l)
                .orElse(new User(0l, "Barack", "Obama"));
        System.out.println("User: " + user.getFirstName() + " " + user.getLastName());

    }
}
