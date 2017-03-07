package com.practo.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practo.entity.Event;

@RestController
public class GaitCollector {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/l", method=RequestMethod.GET)
	public Event greeting(@RequestParam(value = "data") String data) throws JsonParseException, JsonMappingException, IOException {
		byte[] payload = Base64Utils.decodeFromString(data);
		String payloadString = new String(payload);
		ObjectMapper mapper = new ObjectMapper();
		Event event = mapper.readValue(payloadString, Event.class);
		return event;
	}
	
	@RequestMapping(value="/l", method=RequestMethod.POST)
	public Event postGreeting(@RequestBody Event event) {
		return event;
	}
}
