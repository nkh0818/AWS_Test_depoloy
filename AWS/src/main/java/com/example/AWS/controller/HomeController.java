package com.example.AWS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@GetMapping("/")
	public String Home() {
		log.info("홈실행");
		System.out.println("홈메서드 실행");
		return "home";
	}
	@GetMapping("/login")
	public String Login() {
		log.info("로그인 실행");
		System.out.println("로그인 메서드 실행");
		return "login";
	}
}
