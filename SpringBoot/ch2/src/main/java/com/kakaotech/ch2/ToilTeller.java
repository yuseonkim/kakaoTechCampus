package com.kakaotech.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Calendar;

//년원일을 입력하면 요일을 알려주는 프로그램
@Controller
public class ToilTeller {
    @RequestMapping("/getYoil")
    public String main(@ModelAttribute MyDate myDate, Model model) throws IOException {
        //1.입력
//        String year = request.getParameter("year");
//        String month = request.getParameter("month");
//        String day = request.getParameter("day");
//        int yyyy = Integer.parseInt(year);
//        int mm = Integer.parseInt(month);
//        int dd = Integer.parseInt(day);

        //2.작업 - 요일을 계산
        char yoil = getYoil(myDate);

        //작업한 결과를 Model에 저장한다(DS가 Model을 View로 전달)
//        model.addAttribute("year",myDate.getYear());
//        model.addAttribute("month",myDate.getMonth());
//        model.addAttribute("day",myDate.getMonth());
//        model.addAttribute("yoil",yoil);

        
//        return "yoil"; //yoil.html



//        //3.출력
//        response
//        .setCharacterEncoding("utf-8");
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        out.println("<html>");
//        out.println("<head>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("year = " + year);
//        out.println("month = " + month);
//        out.println("day =" + day);
//        out.println("week =" + yoil);
//        out.println("</body>");
//        out.println("</html>");

        return "yoil";
    }
    @ModelAttribute("yoil")
    private static char getYoil(MyDate myDate) {
        Calendar cal = Calendar.getInstance(); //현재 날짜와 시간을 갖는 cal
        cal.clear(); // 초기화
        cal.set(myDate.getYear(), myDate.getMonth() - 1, myDate.getDay()); //월은 0부터 11이기 때문에 1을 빼줘야한다
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1~7 반환 , 1: 일요일 2: 월요일
        char yoil = "일월화수목금토".charAt(dayOfWeek-1);
        return yoil;
    }
}
