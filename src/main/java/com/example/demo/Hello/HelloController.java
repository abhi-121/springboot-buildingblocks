package com.example.demo.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloController {
	//
//	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloworld( ) {
		return "Hello World";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean( ) {
		return new UserDetails("Mad", "Max", "Furry");
	}

}
