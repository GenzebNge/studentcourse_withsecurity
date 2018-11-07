package studentcoursewithsecurity.studentcourse_withsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String homePage(){
        return "homepage";
    }

    @RequestMapping("/homepage")
    public String login(){
        return "hompage";
    }



}
