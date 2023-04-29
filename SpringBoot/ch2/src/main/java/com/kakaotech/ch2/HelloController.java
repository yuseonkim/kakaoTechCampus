package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1.원격프로그램 등록
//2.URL과 메서드를 연결
@RestController
public class HelloController { //원격프로그램
    @RequestMapping("/hello") //url 입력시 메소드 호출
    public String main(){
        System.out.println("Hello");
        return "hello";
    }
}
