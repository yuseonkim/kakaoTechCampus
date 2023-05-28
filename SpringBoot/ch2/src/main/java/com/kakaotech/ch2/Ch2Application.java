package com.kakaotech.ch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Ch2Application {
//실행시 내장되있는 톰캣을 띄우고 톰캣이 원격프로그램을 등록한다.
	public static void main(String[] args) {
		SpringApplication.run(Ch2Application.class, args);
	}

}
