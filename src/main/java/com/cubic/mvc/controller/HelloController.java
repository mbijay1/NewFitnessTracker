package com.cubic.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
		model.addAttribute("greetingmsg", "Hello Cubic");
		return "hello";
	}
	

}
