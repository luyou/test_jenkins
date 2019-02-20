package com.fuiou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitJenkinsApplication.class, args);
	}

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "fuiou") String name) {
		return "hi " + name;
	}
}
