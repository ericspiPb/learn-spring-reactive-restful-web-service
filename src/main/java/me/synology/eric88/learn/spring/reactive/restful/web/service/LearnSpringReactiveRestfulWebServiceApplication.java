package me.synology.eric88.learn.spring.reactive.restful.web.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringReactiveRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringReactiveRestfulWebServiceApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
