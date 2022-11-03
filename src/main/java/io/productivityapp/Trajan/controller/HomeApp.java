package io.productivityapp.Trajan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeApp {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("timerLength", 5);
        return "home";
    }
}
