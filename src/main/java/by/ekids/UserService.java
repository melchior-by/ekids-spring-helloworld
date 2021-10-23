package by.ekids;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>(Arrays.asList(
            new User("Rick", "P@$$word"),
            new User("Morty", "password"),
            new User("Summer", "passwor1d")));

    public List<User> getUserList() {
        return userList;
    }

    public void addUserList(User user) {
        userList.add(user);
    }

    public User getRegularUser() {
        return userList.get(new Random().nextInt(3));
    }
}
