package com.kakaotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    //실행시 내장되있는 톰캣을 띄우고 톰캣이 원격프로그램을 등록한다.
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}