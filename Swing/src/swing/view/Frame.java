package swing.view;

import swing.model.Car;
import swing.model.Rental;
import swing.model.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by agurgul on 30.06.2017.
 */
public class Frame extends JFrame {

    private List<User> users;
    private List<Rental> rentals;
    private List<Car> cars;

    public Frame() {
        super("Car rental");
        users = new ArrayList<>();
        rentals = new ArrayList<>();
        cars = new ArrayList<>();

        JPanel main = new JPanel();
        this.add(main);
        main.setLayout(new GridLayout(2, 2));

        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");
        main.add(username);
        main.add(password);
        JTextField usernameTextField = new JTextField();
        JTextField passwordTextField = new JPasswordField();
        main.add(usernameTextField);
        main.add(passwordTextField);


        setSize(1200,800);
        setResizable(false);
        setLocation(100, 60);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
