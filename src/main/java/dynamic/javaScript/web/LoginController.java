package dynamic.javaScript.web;

import dynamic.javaScript.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLogin(ModelMap model) {
        model.put("user",new User());
        return "login";
    }
}
