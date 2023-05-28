package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
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
    public String login(HttpServletRequest req,String id, String pwd, RedirectAttributes model) throws UnsupportedEncodingException {

        //1. id pw 확인
        if (loginCheck(id, pwd)) {
            model.addAttribute("id",id);
            model.addAttribute("pwd",pwd);
            return "userInfo";
        } else {
            //String msg = URLEncoder.encode( "잘못입력했어요;","utf-8");
            String msg = "잘못입력일";
            model.addAttribute("msg",msg);
            //model.addFlashAttribute("msg","일회용메세지;");
//            req.setAttribute("msg","request에 저잘된 메세지");
            //return "redirect:/login/login?msg="+msg; //GET- URL ReWriting
            return "redirect:/"; //GET- URL ReWriting
        }
    }

    private boolean loginCheck(String id, String pwd) {
        return id.equals("asdf") && pwd.equals("1234");
    }
}
