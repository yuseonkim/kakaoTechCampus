package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hi {
    @RequestMapping("/hi")
    public String hiController(){
        return "hi";
    }
}
