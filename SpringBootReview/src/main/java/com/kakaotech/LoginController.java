package com.kakaotech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
    public String login(String id, String pwd, boolean check, Model model,
                        HttpServletResponse resp) throws UnsupportedEncodingException {
        System.out.println(check);
        if(LoginCheck(id,pwd)){
           if(check){
               Cookie cookie = new Cookie("id",id);
               cookie.setMaxAge(60*24*24);
               resp.addCookie(cookie);
           }else{
               Cookie cookie = new Cookie("id",id);
               cookie.setMaxAge(0);
               resp.addCookie(cookie);
           }
            return "index";
        }
        String msg =URLEncoder.encode("잘못된 비밀번호 혹은 아이디","utf-8");
        return "redirect:/login?msg="+msg;
    }

    private boolean LoginCheck(String id, String pwd) {
        if (id.equals("abcd") && pwd.equals("1234")) {
            return true;
        }
        return false;
    }
}
