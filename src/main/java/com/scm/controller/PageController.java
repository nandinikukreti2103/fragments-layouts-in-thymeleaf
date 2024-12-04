package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler:");
        model.addAttribute("name", "Spring Boot");
        model.addAttribute("youtubeChannel","learn coding");
        model.addAttribute("gitHub", "https://github.com/nandinikukreti2103/QuizApp");
        return "home" ;
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isActive","false");
        System.out.println("about page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";
    }
}
