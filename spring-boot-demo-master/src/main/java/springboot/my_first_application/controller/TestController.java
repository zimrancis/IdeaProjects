package springboot.my_first_application.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String main() {
		return "Spring boot is working!";
	}

}