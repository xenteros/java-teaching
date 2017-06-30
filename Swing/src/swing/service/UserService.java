package swing.service;

import swing.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agurgul on 30.06.2017.
 */
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
    }

    public User addUser (String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setId(users.size()+1l);
        return user;
    }

    public List<User> findAll() {
        return users;
    }
}
