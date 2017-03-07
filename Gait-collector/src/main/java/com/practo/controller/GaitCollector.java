package com.practo.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practo.entity.Event;

@RestController
public class GaitCollector {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/l", method=RequestMethod.GET)
	public Event greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Event(counter.incrementAndGet(), String.format(template, name));
	}
	
}
