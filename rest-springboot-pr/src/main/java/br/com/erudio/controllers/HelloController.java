package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.Hello;

@RestController
public class HelloController {
	
	private static final String template = "Hello %s";
	private final AtomicLong num = new AtomicLong();
	
	@RequestMapping("/hello")
	public Hello helloName(@RequestParam(value = "name", defaultValue = "World") String name) {
			return new Hello(num.incrementAndGet(), String.format(template, name));
	}
	
}
