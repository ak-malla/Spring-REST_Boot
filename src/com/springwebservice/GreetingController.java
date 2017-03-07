package com.springwebservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String s = "Hello, %s";
	// Unique ID generated each timea request is requested
	private final AtomicLong id = new AtomicLong();

	@RequestMapping(path = "/greetings", method = RequestMethod.GET)
	public Greetings greeting(@RequestParam(value = "name", defaultValue = "AK", required = true) String name) {
		return new Greetings(id.incrementAndGet(), String.format(s, name));
	}

}
