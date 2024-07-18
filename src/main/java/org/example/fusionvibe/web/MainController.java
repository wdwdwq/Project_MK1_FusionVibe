package org.example.fusionvibe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String mainPage() {
        return "main";
    }

    @RequestMapping("/music")
    public String musicPage() {
        return "menu/music";
    }


    @RequestMapping("/fashion")
    public String fashionPage() {
        return "menu/fashion";
    }

    @RequestMapping("/join")
    public String joinPage() {
        return "registar/join";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "registar/login";
    }
}
