package com.kakaotech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class RegisterController {

    static String msg;
    @GetMapping("/register")
    public String viewRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String Register(User user, Model m) throws UnsupportedEncodingException {
        if(isValidate(user)){
            return "userInfo";
        }
        msg = URLEncoder.encode(msg,"utf-8");
        //m.addAttribute("msg",msg); 리다이렉트는 무조건 get방식 model은 의미가 없다
        return "redirect:/register?msg="+msg;
    }

    public boolean isValidate(User user){
        if(user.getId().length()<2){
            msg = "ID는 두글자 이상이어야 합니다";
            return false;
        }
        if(user.getPwd().length()<4) {
            msg = "PW는 네글자 이상이어야 합니다";
            return false;

        }
        return true;
    }
}
