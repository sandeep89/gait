package com.practo.controller;

import java.io.IOException;

import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.practo.entity.Event;

@RestController
public class GaitCollector {
	
	@RequestMapping(value="/l", method=RequestMethod.GET)
	public Event greeting(@RequestParam(value = "data") String data) throws JsonParseException, JsonMappingException, IOException {
		byte[] payload = Base64Utils.decodeFromString(data);
		String payloadString = new String(payload);
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = jsonParser.parse(payloadString).getAsJsonObject();
		Gson gson = new Gson();
		String eventString = gson.toJson(jsonObject);
		Event event = gson.fromJson(eventString, Event.class);
		return event;
	}
	
	@RequestMapping(value="/l", method=RequestMethod.POST)
	public Event postGreeting(@RequestBody Event event) {
		return event;
	}
}
