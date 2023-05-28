//package com.kakaotech.ch2;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//@WebFilter(urlPatterns = "/*")
//public class PerformanceFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//        //1.전처리
//        long startTime = System.currentTimeMillis();
//        //2.서블릿 혹 다음 필터
//        filterChain.doFilter(request,response);
//        //3.후처리
//        long endTitme = System.currentTimeMillis();
//        System.out.println("["+((HttpServletRequest)request).getRequestURI()+"]");
//        System.out.println("times="+(endTitme-startTime));
//    }
//}
