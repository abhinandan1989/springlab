package com.asqrlab.samplehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleHelloApplication {

    @RequestMapping("/")
    public String homepage() {
        return "<h1>Hello World Spring Boot! @abhi</h1>";
    }
	public static void main(String[] args) {
		SpringApplication.run(SampleHelloApplication.class, args);
	}

}
