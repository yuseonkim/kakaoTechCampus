package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/login")
public class LoginContoller {
    @GetMapping("/login")
    public String showlogin(){
        return "login";
    }

    //@RequestMapping(value = "/login/login", method = RequestMethod.POST)
    @PostMapping("/login")
    public String login(String id, String pwd, Model model) throws UnsupportedEncodingException {

        //1. id pw 확인
        if (loginCheck(id, pwd)) {
            model.addAttribute("id",id);
            model.addAttribute("pwd",pwd);
            return "userInfo";
        } else {
            String msg = URLEncoder.encode( "잘못입력했어요","utf-8");
            return "redirect:/login/login?msg="+msg; //GET- URL ReWriting
        }
    }

    private boolean loginCheck(String id, String pwd) {
        return id.equals("asdf") && pwd.equals("1234");
    }
}
