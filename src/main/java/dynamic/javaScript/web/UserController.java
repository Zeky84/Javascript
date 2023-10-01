package dynamic.javaScript.web;

import dynamic.javaScript.domain.User;
import dynamic.javaScript.repository.UserRepository;
import dynamic.javaScript.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {

        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/exists")
    @ResponseBody
    public boolean exists(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()) {
            return user.get().getPassword().equals(password);
        }
        return false;
    }
    @PostMapping("/create")
    @ResponseBody
    public Boolean postExists(@RequestBody User creatUser) {
        Optional<User> user = userRepository.findByUsername(creatUser.getUsername());
        if (user.isPresent()) {
            return false;
        }
        User userNew = new User();
        userNew.setUsername(creatUser.getUsername());
        userNew.setPassword(creatUser.getPassword());
        userService.save(userNew);
        return true;
    }

}
