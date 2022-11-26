package com.project.Application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }
    @GetMapping("/navbar")
    public String getnavbar(){
        return "navbar";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/portfolio")
    public String getPortfolio(){
        return "portfolio";
    }
    @GetMapping("/service")
    public String getService(){
        return "service";
    }
    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
