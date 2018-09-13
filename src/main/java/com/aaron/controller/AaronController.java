package com.aaron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aaron")
public class AaronController {
	
	@RequestMapping("/getData")
	@ResponseBody
	public String getData(){
		
		
		return "hello world!";
	}
}
