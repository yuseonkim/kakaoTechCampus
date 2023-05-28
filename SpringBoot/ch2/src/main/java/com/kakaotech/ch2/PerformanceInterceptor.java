package com.kakaotech.ch2;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class PerformanceInterceptor implements HandlerInterceptor { //단일책임원칙 : 하나의 메소드는 하나의 책임만 가진다.

//    long startTime; //iv -인스턴스 변수 , 싱글톤(하나의 객체)라서 여러 쓰레드가 하나의 객체를 공유
    @Override //true 이면, 다음 이터셉터나 컨트롤러를 호출 false면 호출안함
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);

        //handler = 요청하고 연결된 컨트롤러의 메소드
        HandlerMethod method = (HandlerMethod) handler;
        System.out.println("method.getMethod() : "+ method.getMethod()); //URL과 연결된 메소드
        System.out.println("method.getBean() : "+ method.getBean()); //메소드가 포함된 컨트롤러
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        long endTime = System.currentTimeMillis();
        long startTime = (long)request.getAttribute("startTime");
        System.out.println("["+((HttpServletRequest)request).getRequestURI()+"]");
        System.out.println("times="+(endTime-startTime));

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
