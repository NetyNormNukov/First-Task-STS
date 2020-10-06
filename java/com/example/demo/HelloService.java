package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloService implements IHello {
	@Bean
	@Override
	public void sayHello() {
		System.out.println("Say Hello World");
	}
}
