package com.rockScissorPaper.rspSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemGamePlay {

	private String[] sign = {"rock","scissor","paper"};
	
	@GetMapping(value = "/systemGamePlay")
	public String systemGamePlay() {
		
		return sign[(int) (Math.random() * sign.length)];
	}
}
