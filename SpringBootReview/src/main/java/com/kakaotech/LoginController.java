package com.kakaotech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RequestMapping("/login")
@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String id, String pwd, Model model) throws UnsupportedEncodingException {
        if(LoginCheck(id,pwd)){
            model.addAttribute("id",id);
            model.addAttribute("pwd",pwd);
            return "userInfo";
        }
        String msg ="잘못된 비밀번호 혹은 아이디";
        return URLEncoder.encode( "redirect:/login?msg"+msg,"utf-8");
    }

    private boolean LoginCheck(String id, String pwd) {
        if(id.equals("abcd")&&pwd.equals("1234")){
            return true;
        }
        return false;
    }
}
