package by.ekids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UerManagementController {
    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public User[] getUserList() {
        return userService.getUserList().toArray(new User[0]);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUserList(user);
    }
}
