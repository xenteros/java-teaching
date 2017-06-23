package optionals.service;

import optionals.model.User;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

/**
 * Created by agurgul on 23.06.2017.
 */
public class UserService {

    private Set<User> users;

    public UserService() {
        users = new HashSet<>();
        users.add(new User(1l, "Alice", "Smith"));
        users.add(new User(2l, "Bob", "Smith"));
        users.add(new User(3l, "John", "Smith"));
    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public Optional<User> findUser(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return empty();
    }
}
