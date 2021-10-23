package by.ekids;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/simple-users")
    public User[] getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Rick", "P@$$word"));
        userList.add(new User("Morty", "password"));

        return userList.toArray(new User[0]);
    }
}
