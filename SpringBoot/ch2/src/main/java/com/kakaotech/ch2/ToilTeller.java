package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//년원일을 입력하면 요일을 알려주는 프로그램
@RestController
public class ToilTeller {
    @RequestMapping("/getYoil")
    public String main(HttpServletRequest request) {
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        System.out.println("year :"+year);
        System.out.println("month :"+month);
        System.out.println("day :"+day);
        return "Monday";
    }
}
