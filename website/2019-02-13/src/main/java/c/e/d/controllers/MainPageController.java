package c.e.d.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("sh")
    public String getMainPage(){
        return "mainPage";
    }

}
