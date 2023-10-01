package dynamic.javaScript.service;

import dynamic.javaScript.domain.User;
import dynamic.javaScript.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public User findByPassword(String password) {
        return userRepository.findByPassword(password);
    }

}
